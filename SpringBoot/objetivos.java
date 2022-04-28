package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/objetivos")
public class objetivos {

	@GetMapping 
	public String hello() {
		
		return 	"Melhorar conhecimento técnico;"
				+ "\nTreinar mais a cada dia;"
				+ "\nEstudar com os amigos;"
				+ "\nPraticar, praticar e praticar!";
	}
}
	
