package br.com.beneditorodrigo.projetossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

	@GetMapping("/somar/{a}/{b}")
	public int somar(@PathVariable int a, @PathVariable int b) {
		return a + b;
	}
	
	@GetMapping()
	public int subtrair(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b) {
		return a - b;
	}
	
	
}
