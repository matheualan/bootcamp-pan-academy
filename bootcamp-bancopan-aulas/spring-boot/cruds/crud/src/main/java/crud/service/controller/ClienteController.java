package crud.service.controller;

import crud.service.model.ClienteModel;
import crud.service.model.Produto;
import crud.service.repository.ClienteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class ClienteController {

    ClienteRepository clienteRepository;

    @GetMapping("/listar/pessoas.fisicas/{tipo}")
    public ResponseEntity<List<ClienteModel>> filtroId(@PathVariable Integer tipo) {
        return ResponseEntity.ok(clienteRepository.procuraPessoasFisicas(tipo));
    }

    @GetMapping("/listar/clientes/sql/alfabetico")
    public List<ClienteModel> procuraTodosAlfabetico() {
        return clienteRepository.procuraTodosAlfabetico();
    }

    @GetMapping("/listar/clientes/sql")
    public List<ClienteModel> procuraTodos() {
        return clienteRepository.procuraTodos();
    }

    @PostMapping("/clientes")
    public ResponseEntity<Object> createCliente(@RequestBody ClienteModel clienteModel) {
        clienteRepository.createCliente(clienteModel);
        return new ResponseEntity<>("Cliente criado com sucesso!", HttpStatus.CREATED);
    }
}
