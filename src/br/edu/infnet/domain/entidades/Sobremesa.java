package br.edu.infnet.domain.entidades;

public class Sobremesa extends Produto{
	
	private float quantidade;
	private boolean doce;
	private String informacao;

	public Sobremesa(String nome, float valor, int codigo, float quantidade, boolean doce, String informacao) {
		super(nome, valor, codigo);
		this.quantidade = quantidade;
		this.doce = doce;
		this.informacao = informacao;
	}

	@Override
	public float calcularValorTotal() {
	    float valorTotal = getValor() * getQuantidade();      	        
	    return isDoce() ? valorTotal * 1.2f : valorTotal;
	}

	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}

	public boolean isDoce() {
		return doce;
	}

	public void setDoce(boolean doce) {
		this.doce = doce;
	}

	public String getInformacao() {
		return informacao;
	}

	public void setInformacao(String informacao) {
		this.informacao = informacao;
	}

	@Override
	public String toString() {
		return "Sobremesa [quantidade=" + quantidade + ", doce=" + doce + ", informacao=" + informacao + "]";
	}
}
