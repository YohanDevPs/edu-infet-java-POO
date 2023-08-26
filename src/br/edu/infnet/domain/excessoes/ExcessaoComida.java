package br.edu.infnet.domain.excessoes;

public class ExcessaoComida extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ExcessaoComida(String msg) {
        super(msg);
    }
}
