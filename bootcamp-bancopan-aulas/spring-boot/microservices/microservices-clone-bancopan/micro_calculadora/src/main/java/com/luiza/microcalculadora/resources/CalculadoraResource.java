package com.luiza.microcalculadora.resources;

import com.luiza.microcalculadora.Repo.Repo;
import com.luiza.microcalculadora.model.Calculadora;
import com.luiza.microcalculadora.services.CalculadoraService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/resultado")
public class CalculadoraResource {

	@Autowired
	private CalculadoraService service;

	@Autowired
	private Repo clienteReposity;
	
	@GetMapping(value = "/{tabelaId}/multiplique/{dias}")
	public ResponseEntity<Calculadora> getPayment(@PathVariable Long tabelaId, @PathVariable Integer dias) {
		Calculadora calculadora = service.getCalculo(tabelaId, dias);
		return ResponseEntity.ok(calculadora);
	}	
	
	@PostMapping
	ResponseEntity<Calculadora> post(@RequestBody Calculadora clientinho) {

		return ResponseEntity.status(HttpStatus.CREATED).body(clienteReposity.save(clientinho));
	}

}







