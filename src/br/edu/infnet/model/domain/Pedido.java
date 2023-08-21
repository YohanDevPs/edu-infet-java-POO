package br.edu.infnet.model.domain;

import java.time.LocalDateTime;

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
		return "Pedido [descricao=" + descricao + ", data=" + data + ", web=" + web + ", products=" + produtos
				+ ", solicitante=" + solicitante + "]";
	}
}
