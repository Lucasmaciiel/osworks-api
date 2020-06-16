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
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Lucas");
		cliente1.setEmail("lucamaciel@gmail.com");
		cliente1.setTelefone("99700-000");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Michele");
		cliente2.setEmail("michele@gmail.com");
		cliente2.setTelefone("9970-0040");

		return Arrays.asList(cliente1, cliente2);
	}
}
