package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_fornecedor")
public class Fornecedor {

	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFornecedor;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "telefone")
	private String telefone;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "enderecoComp")
	private String enderecoComp;
	
	@Column(name = "contato")
	private String contato;
	
	//CONSTRUTORES
	public Fornecedor() {
		
	}
	
	public Fornecedor(Long idFornecedor, String nome, String telefone, String email, String enderecoComp, String contato) {
		this.idFornecedor = idFornecedor;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.enderecoComp = enderecoComp;
		this.contato = contato;
	}

	//GETTERS E SETTERS
	public Long getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(Long idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getEnderecoComp() {
		return enderecoComp;
	}

	public void setEnderecoComp(String enderecoComp) {
		this.enderecoComp = enderecoComp;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}
	
}
