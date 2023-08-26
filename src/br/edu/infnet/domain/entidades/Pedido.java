package br.edu.infnet.domain.entidades;

import java.time.LocalDateTime;

import br.edu.infnet.domain.utilidades.TempoConversores;

public class Pedido {
	
	private String descricao;
	private LocalDateTime data;
	private boolean web;
	private Produto[] produtos;
	private Solicitante solicitante;
	
	public Pedido() {
		this.produtos = new Produto[0];
	}

	public Pedido(String descricao, LocalDateTime data, boolean web, Produto[] produtos, Solicitante solicitante) {
		this.descricao = descricao;
		this.data = data;
		this.web = web;
		this.produtos = new Produto[0];
		this.solicitante = solicitante;
	}

	public void adicionarProduto(Produto novoProduto) {
        Produto[] novoArray = new Produto[produtos.length + 1];
       
        for (int i = 0; i < produtos.length; i++) {
            novoArray[i] = produtos[i];
        }
        
        novoArray[produtos.length] = novoProduto;
        
        produtos = novoArray;
	}
	
	public float valorTotalPedido() {
        float valorTotalPedido = 0;
        
        for (int i = 0; i < produtos.length; i++) {
			valorTotalPedido += this.produtos[i].getValor();
		}
        
        return valorTotalPedido;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public boolean isWeb() {
		return web;
	}

	public void setWeb(boolean web) {
		this.web = web;
	}	

	public Produto[] getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}

	public Solicitante getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(Solicitante solicitante) {
		this.solicitante = solicitante;
	}

	@Override
	public String toString() {
		return "Informações do solicitante:\n" + solicitante
				+ "\n\nInformações do Pedido: "
					+ "\nDescrição: " + descricao
					+ "\nData do pedido: " + TempoConversores.formatLocalDateTime(data) 
					+ "\nFeito pela web: " + (web ? "Sim" : "Não")
					+ "\nProdutos comprados:\n"
					+ String.format("Comida: %d - %s: R$: %.2f\n", produtos[0].getCodigo(), produtos[0].getNome(), produtos[0].getValor())
					+ String.format("Bebida: %d - %s: R$: %.2f\n", produtos[1].getCodigo(), produtos[1].getNome(), produtos[1].getValor())
					+ String.format("Sobremesa: %d - %s: R$: %.2f\n", produtos[2].getCodigo(), produtos[2].getNome(), produtos[2].getValor())
					+ String.format("Preço total:  %.2f", valorTotalPedido());
		
	}
}
