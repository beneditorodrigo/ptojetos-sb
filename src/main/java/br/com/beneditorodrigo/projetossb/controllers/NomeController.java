package br.com.beneditorodrigo.projetossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nome")
public class NomeController {

	@GetMapping("/{nome}/{sobrenome}")
	public String nomeCompleto1(@PathVariable String nome, @PathVariable String sobrenome) {
		return nome + " " + sobrenome;
	}
	
	@GetMapping("/somar")
	public String nomeCompleto2(
			@RequestParam(name = "nome") String nome,
			@RequestParam(name = "sobrenome") String sobrenome) {
		return nome + " " + sobrenome;
	}
}
