package br.com.bluebank.crudtest.controller;

import br.com.bluebank.crudtest.model.Cliente;
import br.com.bluebank.crudtest.repository.ClienteRepository;
import br.com.bluebank.crudtest.util.DateUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Api
@RestController
@RequestMapping("/persons")
@Log4j2
public class ClienteResource {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private DateUtil dateUtil;

    @ApiOperation("Cadastrar uma pessoa por vez.")
    @PostMapping
    public ResponseEntity<Cliente> save(@RequestBody Cliente cliente) {
        log.info(dateUtil.dataFormatada(LocalDateTime.now()));
        clienteRepository.save(cliente);
        return new ResponseEntity<>(cliente, HttpStatus.OK);
    }

    @ApiOperation("Listar todos os cadastros.")
    @GetMapping(path = "/list")
    public ResponseEntity<List<Cliente>> getAll() {
        log.info(dateUtil.dataFormatada(LocalDateTime.now()));
        List<Cliente> listarClientes = new ArrayList<>();
        listarClientes = clienteRepository.findAll();
        return new ResponseEntity<>(listarClientes, HttpStatus.OK);
    }

    @ApiOperation("Buscar cadastro de uma pessoa por Id.")
    @GetMapping(path = "/list/{id}")
    public ResponseEntity<Optional<Cliente>> getById (@PathVariable Long id) {
        log.info(dateUtil.dataFormatada(LocalDateTime.now()));
        Optional<Cliente> cliente;
        try {
            cliente = clienteRepository.findById(id);
            return new ResponseEntity<Optional<Cliente>>(cliente, HttpStatus.OK);
        } catch (NoSuchElementException nsee) {
            return new ResponseEntity<Optional<Cliente>>(HttpStatus.NOT_FOUND);
        }
    }

    @ApiOperation("Atualizar o cadastro de uma pessoa buscando por Id.")
    @PutMapping(value = "/att/{id}")
    public ResponseEntity<Cliente> update (@PathVariable Long id, @RequestBody Cliente attCliente) {
        log.info(dateUtil.dataFormatada(LocalDateTime.now()));
        return clienteRepository.findById(id)
                .map(cliente -> {
                    cliente.setNome(attCliente.getNome());
                    cliente.setDataNascimento(attCliente.getDataNascimento());
                    cliente.setNomeMae(attCliente.getNomeMae());
                    cliente.setCpf(attCliente.getCpf());
                    cliente.setRg(attCliente.getRg());
                    Cliente clienteAtualizado = clienteRepository.save(cliente);
                    return ResponseEntity.ok().body(clienteAtualizado);
                }).orElse(ResponseEntity.notFound().build());
    }

    @ApiOperation("Deletar uma pessoa do cadastro buscando por Id.")
    @DeleteMapping(path = "/del/{id}")
    public ResponseEntity<Optional<Cliente>> deleteById(@PathVariable Long id) {
        log.info(dateUtil.dataFormatada(LocalDateTime.now()));
        try {
            clienteRepository.deleteById(id);
            return new ResponseEntity<Optional<Cliente>>(HttpStatus.OK);
        } catch (NoSuchElementException nsee) {
            return new ResponseEntity<Optional<Cliente>>(HttpStatus.NOT_FOUND);
        }
    }

}
