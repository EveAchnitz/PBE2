package br.com.joalheriajoiasjoia.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joalheriajoiasjoia.app.entities.Fornecedor;
import br.com.joalheriajoiasjoia.app.services.FornecedorService;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {

	//ATRIBUTOS
	@Autowired
	private FornecedorService fornecedorService;
	
	//MÉTODOS
	@PostMapping
	public Fornecedor createFornecedor(@RequestBody Fornecedor fornecedor) {
		return fornecedorService.saveFornecedor(fornecedor);
	}
	
	@GetMapping
	public List<Fornecedor> getAllFornecedores(){
		return fornecedorService.getAllFornecedores();
	}
	
	@GetMapping("/{id}")
	public Fornecedor getFornecedorById(@PathVariable Long id) {
		return fornecedorService.getFornecedorById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteFornecedorById(@PathVariable Long id) {
		fornecedorService.deleteFornecedor(id);
	}
}
