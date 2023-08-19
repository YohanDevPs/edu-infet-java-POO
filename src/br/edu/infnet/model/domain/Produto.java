package br.edu.infnet.model.domain;

public abstract class Produto {
	
	private String nome;
	private float valor;
	private int codigo;
	
	public Produto(String nome, float valor, int codigo) {
		this.nome = nome;
		this.valor = valor;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}
