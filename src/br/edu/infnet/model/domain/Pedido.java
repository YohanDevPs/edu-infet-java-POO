package br.edu.infnet.model.domain;

import java.time.LocalDateTime;

public class Pedido {
	
	private String descricao;
	private LocalDateTime data;
	private boolean web;
	
	public Pedido(String descricao, LocalDateTime data, boolean web) {
		this.descricao = descricao;
		this.data = data;
		this.web = web;
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
}
