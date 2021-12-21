package com.aws.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuarioController {

    //	@Autowired
//	private UsuarioRepository repository;
//
//	@GetMapping
//	public ResponseEntity<List<Usuario>> GetAll() {
//		return ResponseEntity.ok(repository.findAll());
//	}
//
//
//	@GetMapping("/{id}")
//	public ResponseEntity<Usuario> GetById(@PathVariable long id) {
//		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
//	}
//
//
//
//	@PostMapping
//	public ResponseEntity<Usuario> Post(@RequestBody Usuario usuario) {
//		return ResponseEntity.ok(repository.save(usuario));
//	}

}
