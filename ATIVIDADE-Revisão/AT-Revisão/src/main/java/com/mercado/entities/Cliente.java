package com.mercado.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class Cliente {

	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCliente;
	
	@Column(name = "nome", length = 100, nullable = false)
	private String nome;
	
	@Column(name = "rg", length = 9, nullable = false, unique = true)
	private String rg;
	
	@Column(name = "telefone", length = 11, nullable = false)
	private String telefone;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	//CONSTRUTORES
	public Cliente() {
		
	}
	
	public Cliente(Long idCliente, String nome, String rg, String telefone, String email) {
		this.idCliente = idCliente;
		this.nome = nome;
		this.rg = rg;
		this.email = email;
		this.telefone = telefone;
	}

	//GETTERS E SETTERS
	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
