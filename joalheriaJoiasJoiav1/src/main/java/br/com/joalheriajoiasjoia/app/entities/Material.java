package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Material {

	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMaterial;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name ="tipo")
	private String tipo;
	
	//CONSTRUTORES
	public Material() {
		
	}
	
	public Material(Long idMaterial, String nome, String tipo) {
		this.idMaterial = idMaterial;
		this.nome = nome;
		this.tipo = tipo;
	}

	//GETTERS E SETTERS
	public Long getIdMaterial() {
		return idMaterial;
	}

	public void setIdMaterial(Long idMaterial) {
		this.idMaterial = idMaterial;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
