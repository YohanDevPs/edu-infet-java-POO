package main.br.edu.infnet.servicos;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.JOptionPane;

import main.br.edu.infnet.entidates.Bebida;
import main.br.edu.infnet.entidates.Comida;
import main.br.edu.infnet.entidates.Pedido;
import main.br.edu.infnet.entidates.Produto;
import main.br.edu.infnet.entidates.Sobremesa;
import main.br.edu.infnet.entidates.Solicitante;
import main.br.edu.infnet.excessoes.ExcessaoBebida;
import main.br.edu.infnet.excessoes.ExcessaoComida;
import main.br.edu.infnet.excessoes.ExcessaoSobremesa;
import main.br.edu.infnet.excessoes.ExcessaoSolicitante;
import main.br.edu.infnet.repositorios.ProvedorBebida;
import main.br.edu.infnet.repositorios.ProvedorComida;
import main.br.edu.infnet.repositorios.ProvedorSobremesa;
import main.br.edu.infnet.utilidades.ArquivoUtilidades;

public class ServicoPedido {
	
	public static void realizarPedido()  {	
		Scanner sc = new Scanner(System.in);
			
		Pedido pedido = new Pedido();		
		String diretorioArquivoSolicitante = pegarCaminhoPeloDialog();
		try {	
			Solicitante solicitante = pegarSolicitante(diretorioArquivoSolicitante);
			verificarCamposSolicitante(solicitante);
			pedido.setSolicitante(solicitante);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
				
		System.out.print("O pedido será feito pela web(s/n)?  ");
		String pedidoFeitoPorWeb = sc.nextLine();
		if(pedidoFeitoPorWeb.equals("s")) {
			pedido.setWeb(true);
			adicionarProdutos(sc, pedido);
		} else {
			pedido.setWeb(false);
			adicionarProdutos(sc, pedido);
		}
		
		System.out.print("Digite alguma modificação ou descrição:  ");
		sc.nextLine();
		String descricao = sc.nextLine();
		pedido.setDescricao(descricao);
		
		pedido.setData(LocalDateTime.now());
		
		String path = ArquivoUtilidades.obterDiretorioPai(diretorioArquivoSolicitante);
		ArquivoUtilidades.criarArquivo(path + "\\arquivo_pedido.txt", pedido);
		sc.close();
	}
	
	private static Solicitante pegarSolicitante(String caminhoArquivo) throws FileNotFoundException {
		File arquivo = new File(caminhoArquivo);

		Scanner sc = new Scanner(arquivo);
		String[] infSolicitante = new String[3];
		int i = 0;
		while(sc.hasNextLine()) {
			infSolicitante[i] = sc.nextLine();
			i++;
		}

		Solicitante solicitante = new Solicitante(infSolicitante[0], infSolicitante[1], infSolicitante[2]);
		
		sc.close();
		return solicitante;
	}
	
	 private static void verificarCamposSolicitante(Solicitante solicitante) {
	    if (solicitante.getNome().isEmpty() || solicitante.getCpf().isEmpty() || solicitante.getEmail().isEmpty()) {
	      throw new ExcessaoSolicitante("Todos os campos do solicitante devem estar preenchidos");
	    }
	 }
	 
	private static void adicionarProdutos(Scanner sc, Pedido pedido) {	
		pedido.adicionarProduto(pedirComida(sc));
		pedido.adicionarProduto(pedirBebida(sc));
		pedido.adicionarProduto(pedirSobremesa(sc));
	}

	private static Produto pedirSobremesa(Scanner sc) {
		System.out.println("\nTemos Sobremesas salgadas ou doces. Digite 'salgado' ou 'doce' para selecionar: ");
		
		String tipoSobremesa = sc.next();
		sc.nextLine();
		
		switch (tipoSobremesa) {
		case "salgado": {
			
			System.out.println("Digite o cogido desejado das seguintes opções entre as sobremesas salgadas: ");
			
			Set<Sobremesa> sobremesas = ProvedorSobremesa.pegarSobremesasSalgadas();
			
			for (Sobremesa sobremesa: sobremesas) {
				System.out.printf("Codigo: %d - %s%n", sobremesa.getCodigo(), sobremesa.getNome()); 	
			}
			
			System.out.print("Digite a Codigo: ");
			int sobremesaSelecionada = sc.nextInt();
			return sobremesas.stream()
					.filter(c -> c.getCodigo() == sobremesaSelecionada)
					.findFirst()
					.get();
		}
		
		case "doce": {
			System.out.println("Digite o cogido desejado das seguintes opções entre as sobremesas doces: ");
			
			Set<Sobremesa> sobremesas = ProvedorSobremesa.pegarSobremesasDoces();
						
			for (Sobremesa sobremesa: sobremesas) {
				System.out.printf("Codigo: %d - %s%n", sobremesa.getCodigo(), sobremesa.getNome()); 	
			}
						
			int sobremesaSelecionada = sc.nextInt();
			return sobremesas.stream()
					.filter(c -> c.getCodigo() == sobremesaSelecionada)
					.findFirst()
					.get();
		}
		
		default:
			throw new ExcessaoSobremesa("Sobremesa não encontrada");
		}
	}

	private static Comida pedirComida(Scanner sc) {
		System.out.println("\nTemos menu para comida vegana ou não vegana. " 
				+ "\nDigite 'comida vegana' ou 'comida nao vegana' para selecionar o que deseja.");
		
		String tipoComida = sc.nextLine();
		
		switch (tipoComida) {
		case "comida vegana": {
			System.out.println("Digite o codigo da comida vegana que deseja. "
						+ "Temos as seguintes opções: ");
			Set<Comida> comidasVeganas = ProvedorComida.pegarComidasVeganas();
			
			for (Comida comida : comidasVeganas) {
				System.out.printf("Codigo: %d - %s%n", comida.getCodigo(), comida.getNome()); 
			}
			
			System.out.print("Digite a Codigo: ");
			int codigoComida = sc.nextInt();
			
			return comidasVeganas.stream()
					.filter(c -> c.getCodigo() == codigoComida)
					.findAny()
					.get();
		}
		case "comida nao vegana": {
			System.out.println("Digite o codigo da comida não vegana que deseja. "
					+ "Temos as seguintes opções: ");
			
			Set<Comida> comidasNaoVeganas = ProvedorComida.pegarComidasNaoVeganas();
			
			for (Comida comida : comidasNaoVeganas) {
				System.out.printf("Codigo: %d - %s%n", comida.getCodigo(), comida.getNome()); 
			}
			
			System.out.print("Digite a Cogigo: ");
			int codigoComida = sc.nextInt();
			
			return comidasNaoVeganas.stream()
					.filter(c -> c.getCodigo() == codigoComida)
					.findAny()
					.get();
			}
		
		default:
			throw new ExcessaoComida("Comida não encontrada");
		}
	}
	
	private static Bebida pedirBebida(Scanner sc) {
		System.out.println("\nTemos 3 bebidas. Para bebidas geladas, será adicionado uma taxa de 2 reais. " 
				+ "\nDigite o codigo entre as seguintes opções:" );
		Set<Bebida> bebidas = ProvedorBebida.pegarBebidas();
		
		for (Bebida bebida: bebidas) {
			System.out.printf("Codigo: %d - %s%n", bebida.getCodigo(), bebida.getNome()); 	
		}
	
		System.out.print("Digite a Codigo: ");
		int codigoComida = sc.nextInt();
		Bebida bebidaSelecionada = bebidas.stream()
				.filter(c -> c.getCodigo() == codigoComida)
				.findAny()
				.orElseThrow(() ->  new ExcessaoBebida("Bebida não encontrada"));
		
		
		System.out.print("Deseja que essa bebida seja gelada? (s/n) ");
		
		Character gelada = sc.next().charAt(0);
		
		bebidaSelecionada.setGelada(gelada == 's' ? true : false);
		return bebidaSelecionada;	
	}
	

    public static String pegarCaminhoPeloDialog() {
        return replaceBackslashes(JOptionPane.showInputDialog("Insira o caminho que será gerado o arquivo:"));
    }
    
    public static String replaceBackslashes(String input) {
        return input.replaceAll("\\\\", "\\\\\\\\");
    }
}
