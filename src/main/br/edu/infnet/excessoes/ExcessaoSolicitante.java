package main.br.edu.infnet.excessoes;

public class ExcessaoSolicitante extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ExcessaoSolicitante(String msg) {
        super(msg);
    }
}