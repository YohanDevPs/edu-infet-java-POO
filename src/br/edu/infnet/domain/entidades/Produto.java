package br.edu.infnet.domain.entidades;

public abstract class Produto implements Comparable<Produto>{
	
	private String nome;
	private float valor;
	private int codigo;
	
	public Produto(String nome, float valor, int codigo) {
		this.nome = nome;
		this.valor = valor;
		this.codigo = codigo;
	}
	
	public abstract float calcularValorTotal();

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

	@Override
	public int compareTo(Produto outroProduto) {
	    return Integer.compare(this.codigo, outroProduto.codigo);
	}
	
	@Override
	public String toString() {
		return nome + ", valor R$ " + valor + ", codigo = " + codigo;
	}
}
