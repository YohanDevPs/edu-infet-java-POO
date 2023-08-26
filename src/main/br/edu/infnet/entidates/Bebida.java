package main.br.edu.infnet.entidates;

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
	
	@Override
	public float calcularValorTotal() {
		return isGelada() ? getValor() + 2 : getValor();
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

	@Override
	public String toString() {
		return "Bebida [gelada=" + gelada + ", tamanho=" + tamanho + ", marca=" + marca + "]";
	}
}