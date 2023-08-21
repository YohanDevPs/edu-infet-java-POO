package br.edu.infnet;

import java.util.Scanner;
import java.util.Set;

import br.edu.infnet.model.domain.Bebida;
import br.edu.infnet.model.domain.Comida;
import br.edu.infnet.model.domain.Pedido;
import br.edu.infnet.model.domain.Produto;
import br.edu.infnet.model.domain.Sobremesa;
import br.edu.infnet.model.domain.repositorio.ProvedorBebida;
import br.edu.infnet.model.domain.repositorio.ProvedorComida;
import br.edu.infnet.model.domain.repositorio.ProvedorSobremesa;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("O pedido será feito pela web(s/n)?  ");
		
		String pedidoFeitoPorWeb = sc.nextLine();
		
		Pedido pedido = new Pedido();
		
		if(pedidoFeitoPorWeb.equals("s")) {
			pedido.setWeb(true);
			pedirPorWeb(sc, pedido);
		} else {
			pedido.setWeb(false);
		}
		
	}

	private static void pedirPorWeb(Scanner sc, Pedido pedido) {
		System.out.println("O pedido está sendo feito pela web.");
		
		pedido.adicionarProduto(pedirComida(sc));
		pedido.adicionarProduto(pedirBebida(sc));
		pedido.adicionarProduto(pedirSobremesa(sc));
	}

	private static Produto pedirSobremesa(Scanner sc) {
		System.out.println("Sobremesas salgadas ou doces. Qual digite o tipo (salgado/doce) desejado: ");
		
		String tipoSobremesa = sc.next();
		sc.nextLine();
		
		if(tipoSobremesa.equals("salgado")) {
			System.out.println("Digite o cogido desejado das seguintes opções entre as sobreme salgados: ");
			
			Set<Sobremesa> sobremesas = ProvedorSobremesa.pegarSobremesasSalgadas();
			
			for (Sobremesa sobremesa: sobremesas) {
				System.out.printf("Codigo: %d - %s%n", sobremesa.getCodigo(), sobremesa.getNome()); 	
			}
			
			int sobremesaSelecionada = sc.nextInt();
			return sobremesas.stream()
					.filter(c -> c.getCodigo() == sobremesaSelecionada)
					.findFirst()
					.get();
		} else if (tipoSobremesa.equals("doce")){
			System.out.println("Digite o cogido desejado das seguintes opções entre os doces salgados: ");
						
			Set<Sobremesa> sobremesas = ProvedorSobremesa.pegarSobremesasDoces();
						
			for (Sobremesa sobremesa: sobremesas) {
				System.out.printf("Codigo: %d - %s%n", sobremesa.getCodigo(), sobremesa.getNome()); 	
			}
						
			int sobremesaSelecionada = sc.nextInt();
			return sobremesas.stream()
					.filter(c -> c.getCodigo() == sobremesaSelecionada)
					.findFirst()
					.get();
		} else {
			throw new RuntimeException("Opção não encontrada, digite apenas salgado ou doce.");
		}
	}

	public static Comida pedirComida(Scanner sc) {
		System.out.println("Temos menu para comida vegana ou não vegana. " 
				+ "Digite 'comida vegana' ou 'comida nao vegana' para selecionar o que deseja.");
		
		String tipoComida = sc.nextLine();
		
		if(tipoComida.equals("comida vegana")) {
			System.out.println("Digite o numero da comida vegana que deseja. "
						+ "Temos as seguintes opções: ");
			Set<Comida> comidasVeganas = ProvedorComida.pegarComidasVeganas();
			
			for (Comida comida : comidasVeganas) {
				System.out.printf("Codigo: %d - %s%n", comida.getCodigo(), comida.getNome()); 
			}
			
			int codigoComida = sc.nextInt();
			
			return comidasVeganas.stream()
					.filter(c -> c.getCodigo() == codigoComida)
					.findAny()
					.get();
		} else {
			System.out.println("Digite o numero da comida não vegana que deseja. "
					+ "Temos as seguintes opções: ");
			
			Set<Comida> comidasNaoVeganas = ProvedorComida.pegarComidasNaoVeganas();
			
			for (Comida comida : comidasNaoVeganas) {
				System.out.printf("Codigo: %d - %s%n", comida.getCodigo(), comida.getNome()); 
			}
			
			int codigoComida = sc.nextInt();
			
			return comidasNaoVeganas.stream()
					.filter(c -> c.getCodigo() == codigoComida)
					.findAny()
					.get();
			}
	}
	
	public static Bebida pedirBebida(Scanner sc) {
		System.out.println("Temos 3 bebidas. Para bebidas geladas, será adicionado uma taxa de 2 reais. " 
				+ "Digite o codigo entre as seguintes opções:" );
		Set<Bebida> bebidas = ProvedorBebida.pegarBebidas();
		
		for (Bebida bebida: bebidas) {
			System.out.printf("Codigo: %d - %s%n", bebida.getCodigo(), bebida.getNome()); 	
		}
	
		int codigoComida = sc.nextInt();
		Bebida bebidaSelecionada = bebidas.stream()
				.filter(c -> c.getCodigo() == codigoComida)
				.findAny()
				.get();
		
		
		System.out.println("Deseja que essa bebida seja gelada? (s/n) ");
		
		Character gelada = sc.next().charAt(0);
		
		bebidaSelecionada.setGelada(gelada == 's' ? true : false);
		return bebidaSelecionada;	
	}
}
