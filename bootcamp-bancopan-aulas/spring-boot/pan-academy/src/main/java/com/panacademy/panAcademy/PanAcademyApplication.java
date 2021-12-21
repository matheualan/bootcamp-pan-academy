package com.panacademy.panAcademy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tabelas.Produtos;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.panacademy.panAcademy.controller")
public class PanAcademyApplication {

	public static void main(String[] args) {
		SpringApplication.run(PanAcademyApplication.class, args);

		Produtos produto1 = new Produtos();
		produto1.setDescricao("Luva");
		produto1.setValor(20.5);

		System.out.println(produto1);
		System.out.println(produto1.getDescricao());
		System.out.println(produto1.getValor());
	}
}
