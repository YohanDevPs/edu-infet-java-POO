package br.edu.infnet.domain.repositorio;

import java.util.Set;
import java.util.TreeSet;

import br.edu.infnet.domain.entidades.Sobremesa;

public class ProvedorSobremesa {
	
	public static Set<Sobremesa> pegarSobremesasDoces() {
		Set<Sobremesa> sobremesasDoces = new TreeSet<>();
		
		sobremesasDoces.add(new Sobremesa("Bolo de chocolate", 20f, 1, 1, true,
				"Uma fatia de bolo de chocolate com uma espessa e generosa calda de chocolate"));

		sobremesasDoces.add(new Sobremesa("Mousse de maracujá", 30f, 2, 1, true, 
				"Um pote de mousse de Maracuja com sementes"));
		
		sobremesasDoces.add(new Sobremesa("Bem-casado", 35f, 3, 1, true, 
				"Doce popular. Seu aspecto é semenhante a um biscoito, com recheio e calda de doce de leite"));
		
		return sobremesasDoces;	
	}
	
	public static Set<Sobremesa> pegarSobremesasSalgadas() {
		Set<Sobremesa> sobremesasSalgadas = new TreeSet<>();
		
		sobremesasSalgadas.add(new Sobremesa("Torta Salgada de Banana", 27f, 4, 1, false,
				"Deliciosa torta de banana. Feita no forno"));

		sobremesasSalgadas.add(new Sobremesa("Bolo Salgado De Polvilho", 26f, 5, 1, false, 
				"Bolo de polvilho. Gosto de receita de vó, perfeito com café"));
		
		sobremesasSalgadas.add(new Sobremesa("Tortinha de alho", 35f, 6, 1, false, 
				"Pequena torta de alho bem temperada"));
		
		return sobremesasSalgadas;	
	}
}
