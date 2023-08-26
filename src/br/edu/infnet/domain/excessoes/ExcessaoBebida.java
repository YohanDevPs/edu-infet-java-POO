package br.edu.infnet.domain.excessoes;

public class ExcessaoBebida extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ExcessaoBebida(String msg) {
        super(msg);
    }
}
