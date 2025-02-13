package com.mercado.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mercado.entities.Cliente;
import com.mercado.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	//ATRIBUTOS
	@Autowired
	private ClienteService clienteService;
	
	//MÉTODOS
	@PostMapping
	public Cliente createCliente(@RequestBody Cliente cliente) {
		return clienteService.saveCliente(cliente);
	}
	
	@GetMapping
	public List<Cliente> getAllClientes() {
		return clienteService.getAllClientes();
	}
	
	@GetMapping("/{id}")
	public Cliente getClienteById(@PathVariable long id) {
		return clienteService.getClienteById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCliente(@PathVariable long id) {
		clienteService.deleteCliente(id);
	}
}
