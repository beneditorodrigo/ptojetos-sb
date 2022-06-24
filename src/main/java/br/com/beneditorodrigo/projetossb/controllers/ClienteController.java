package br.com.beneditorodrigo.projetossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.beneditorodrigo.projetossb.models.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@GetMapping("/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Rodrigo", "123.654.789-10");
	}
}
