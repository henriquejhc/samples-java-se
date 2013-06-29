

import java.io.Serializable;

public class Pessoa implements Serializable {

	private String nome;
	private int idade;
	private transient double salario;
	private boolean ativo;
	
	public Pessoa(String nome, int idade, double salario, boolean ativo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.ativo = ativo;
	}

	public Pessoa() {}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	
}
