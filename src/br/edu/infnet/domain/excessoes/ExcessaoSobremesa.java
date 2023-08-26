package br.edu.infnet.domain.excessoes;

public class ExcessaoSobremesa extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ExcessaoSobremesa(String msg) {
        super(msg);
    }
}