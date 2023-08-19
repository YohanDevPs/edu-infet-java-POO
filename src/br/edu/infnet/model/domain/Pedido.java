package br.edu.infnet.model.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
	
	private String descricao;
	private LocalDateTime data;
	private boolean web;
	private List<Produto> products;
	private Solicitante solicitante;
	
	public Pedido(String descricao, LocalDateTime data, boolean web, List<Produto> products, Solicitante solicitante) {
		this.descricao = descricao;
		this.data = data;
		this.web = web;
		this.products = products;
		this.solicitante = solicitante;
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

	public List<Produto> getProducts() {
		return products;
	}

	public void setProducts(List<Produto> products) {
		this.products = products;
	}

	public Solicitante getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(Solicitante solicitante) {
		this.solicitante = solicitante;
	}
}
