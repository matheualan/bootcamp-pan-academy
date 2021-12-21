package com.aws.controller;

import com.aws.model.Texto;
import com.aws.repository.TextoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/textos")
@CrossOrigin("*")
public class TextoController {

    @Autowired
    private TextoRepository repository;

    @GetMapping
    public ResponseEntity<List<Texto>> GetAll(){
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Texto> GetById(@PathVariable long id){
        return repository.findById(id)
                .map(resp -> ResponseEntity.ok(resp))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Texto> post (@RequestBody Texto postagem){
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
    }

    @PutMapping
    public ResponseEntity<Texto> put (@RequestBody Texto postagem){
        return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        repository.deleteById(id);
    }

}