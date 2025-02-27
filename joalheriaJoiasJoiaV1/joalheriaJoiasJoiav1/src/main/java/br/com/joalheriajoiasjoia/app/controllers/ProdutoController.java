package br.com.joalheriajoiasjoia.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joalheriajoiasjoia.app.entities.Produto;
import br.com.joalheriajoiasjoia.app.services.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	//ATRIBUTOS
	@Autowired
	private ProdutoService produtoService;
	
	//MÉTODOS
	@PostMapping
	public Produto createProduto(@RequestBody Produto produto) {
		return produtoService.saveProduto(produto);
	}
	
	@GetMapping
	public List<Produto> getAllProdutos() {
		return produtoService.getAllProdutos();
	}
	
	@GetMapping("/{id}")
	public Produto getProdutoById(Long id) {
		return produtoService.getProdutoById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduto(Long id) {
		produtoService.deleteProduto(id);
	}
}
