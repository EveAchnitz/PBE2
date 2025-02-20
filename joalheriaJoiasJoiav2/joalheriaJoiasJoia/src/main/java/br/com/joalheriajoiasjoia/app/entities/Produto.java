package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class Produto {

	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduto;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "preco")
	private double preco;
	
	@Column(name = "cor")
	private String cor;
	
	//CONSTRUTORES
	public Produto() {
		
	}
	
	public Produto(Long idProduto, String nome, double preco, String cor) {
		this.idProduto = idProduto;
		this.nome = nome;
		this.preco = preco;
		this.cor = cor;
	}
	
	//GETTERS E SETTERS
	public Long getIdProduto() {
		return idProduto;
	}
	
	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
}