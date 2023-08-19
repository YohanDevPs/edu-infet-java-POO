package br.edu.infnet.model.domain;

public class Bebida extends Produto{

	private boolean gelada;
	private float tamanho;
	private String marca;
	
	public Bebida(String nome, float valor, int codigo, boolean gelada, float tamanho, String marca) {
		super(nome, valor, codigo);
		this.gelada = gelada;
		this.tamanho = tamanho;
		this.marca = marca;
	}

	public boolean isGelada() {
		return gelada;
	}
	
	public void setGelada(boolean gelada) {
		this.gelada = gelada;
	}
	
	public float getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
}
