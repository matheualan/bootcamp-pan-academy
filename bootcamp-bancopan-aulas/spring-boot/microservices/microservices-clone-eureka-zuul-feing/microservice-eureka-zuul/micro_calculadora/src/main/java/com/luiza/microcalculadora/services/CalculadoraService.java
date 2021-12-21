package com.luiza.microcalculadora.services;

import com.luiza.microcalculadora.WorkerFeignClient;
import com.luiza.microcalculadora.model.Calculadora;
import com.luiza.microcalculadora.model.Tabela;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

	@Autowired
	private WorkerFeignClient workerFeignClient;

	public Calculadora getCalculo(long tabelaId, int dias) {
		Tabela tabelinha = workerFeignClient.findById(tabelaId).getBody();
		return new Calculadora(tabelinha.getPessoa(), tabelinha.getPrecoPorDia(), dias);
	}

}













