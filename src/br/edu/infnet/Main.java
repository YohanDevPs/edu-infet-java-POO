package br.edu.infnet;

import java.util.Scanner;

import br.edu.infnet.model.domain.Pedido;
import br.edu.infnet.model.domain.Solicitante;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("O pedido será feito pela web(s/n)?");
		
		String pedidoFeitoPorWeb = sc.next();
		
		Pedido pedido = new Pedido();
		
		if(pedidoFeitoPorWeb == "s") {
			pedido.setWeb(true);
		} else {
			pedido.setWeb(false);
		}
		
		Solicitante solicitante = criarSolicitante(sc);
		pedido.setSolicitante(solicitante);
		
		pedirComida(solicitante);	
	}

	public static Solicitante criarSolicitante(Scanner sc) {
		Solicitante solicitante = new Solicitante();
		
		System.out.println("Informações do solicitante: ");

		System.out.println("Nome: ");
		solicitante.setNome(sc.next());
		
		System.out.println("cpf: ");
		solicitante.setCpf(sc.next());
		
		System.out.println("e-mail: ");
		solicitante.setEmail(sc.next());
		return solicitante;
	}
	
	public static void pedirComida(Solicitante solicitante, boolean pelaWeb) {
		System.out.printf("O que deseja pedir de comida %s?. Temos ", solicitante.getNome());
	}
	
	public static void pedirComida(Solicitante solicitante) {
		System.out.printf("O que deseja pedir de comida %s?. Temos ", solicitante.getNome());
	}
}
