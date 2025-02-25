package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Endereco;
import br.com.joalheriajoiasjoia.app.repositories.EnderecoRepository;

@Service
public class EnderecoService {

	//ATRIBUTOS
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	//MÉTODOS
	public Endereco saveEndereco(Endereco endereco) {
		return enderecoRepository.save(endereco);
	}
	
	public List<Endereco> getAllEnderecos(){
		return enderecoRepository.findAll();
	}
	
	public Endereco getEnderecoByCep (String cep) {
		return enderecoRepository.findByCep(cep);
	}
	
	public void deleteEndereco(Long id) {
		enderecoRepository.deleteById(id);
	}
}
