package main.br.edu.infnet.excessoes;

public class ExcessaoComida extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ExcessaoComida(String msg) {
        super(msg);
    }
}
