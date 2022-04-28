package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/bsm")
public class bSM {
	
	@GetMapping 
	public String hello() {
		
		return 	"Mentalidade de Crescimento;"
				+ "\nPersistência;"
				+ "\nResponsabilidade Pessoal;"
				+ "\nOrientação ao Futuro;"
				+ "\nComunicação;"
				+ "\nOrientação ao Detalhe;";
		}

}
