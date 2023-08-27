package main.br.edu.infnet.excessoes;

public class ExcessaoSobremesa extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ExcessaoSobremesa(String msg) {
        super(msg);
    }
}