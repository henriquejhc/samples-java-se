package io;

import java.io.Serializable;

public class Cliente implements Serializable {

	private static final long serialVersionUID = 1188712301904938559L;
	
	private String nome;
	private transient String cpf;
	private Integer codigo;
	private Boolean ativo;
	private transient Endereco endereco;
	
	public Cliente() {
		super();
	}
	
	public Cliente(String nome, String cpf, Integer codigo, Boolean ativo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.codigo = codigo;
		this.ativo = ativo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return codigo + " - " + nome + " - " + cpf + " - " + ativo + "\n" + endereco;
	}
	
	
}
