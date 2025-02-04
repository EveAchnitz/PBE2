package com.mercado.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduto;
	
	@Column(name = "categoria", nullable = false)
	private String categoria;
	
	@Column(name = "preco", length = 4, nullable = false)
	private double preco;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "marca", nullable = false)
	private String marca;
	
	@ManyToOne
	private Cliente cliente;
	
	//CONSTRUTORES
	public Produto() {
		
	}
	
	public Produto(Long idProduto, String categoria, double preco, String nome, String marca) {
		this.idProduto = idProduto;
		this.categoria = categoria;
		this.preco = preco;
		this.nome = nome;
		this.marca = marca;
	}

	//GETTERS E SETTERS
	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
