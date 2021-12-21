package crud.service.controller;

import crud.service.repository.ProdutoService;
import crud.service.model.Produto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class ProdutoController {
    ProdutoService produtoService;

    @GetMapping(value = "/listar")
    public ResponseEntity<Object> getProduto() {
        return new ResponseEntity<>(produtoService.getProdutos(), HttpStatus.OK);
    }

    @DeleteMapping("/deletar")
    public ResponseEntity<Object> delete(@PathVariable("id") String id) {
        produtoService.deleteProduto(id);
        return new ResponseEntity<>("Produto deletado com sucesso.", HttpStatus.OK);
    }

    @PostMapping("/produtos")
    public ResponseEntity<Object> createProduto(@RequestBody Produto produto) {
        produtoService.createProduto(produto);
        return new ResponseEntity<>("Produto criado com sucesso.", HttpStatus.CREATED);
    }
}
