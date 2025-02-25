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

import br.com.joalheriajoiasjoia.app.entities.Endereco;
import br.com.joalheriajoiasjoia.app.services.EnderecoService;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

	//ATRIBUTOS
	@Autowired
	private EnderecoService enderecoService;
	
	//MÉTODOS
	@PostMapping
	public Endereco createEndereco(@RequestBody Endereco endereco) {
		return enderecoService.saveEndereco(endereco);
	}
	
	@GetMapping
	public List<Endereco> getAllEnderecos(){
		return enderecoService.getAllEnderecos();
	}
	
	@GetMapping("/{cep}")
	public Endereco getEndereco(@PathVariable String cep) {
		return enderecoService.getEnderecoByCep(cep);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEndereco(@PathVariable Long id) {
		enderecoService.deleteEndereco(id);
	}
}
