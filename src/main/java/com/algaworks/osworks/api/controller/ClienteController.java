package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Joao");
		cliente1.setEmail("joaodascouves@teste.com");
		cliente1.setTelefone("21 99999-8888");
		
		return Arrays.asList(cliente1);
		
	}

}
