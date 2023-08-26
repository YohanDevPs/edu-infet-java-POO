package br.edu.infnet.domain.repositorio;

import java.util.Set;
import java.util.TreeSet;

import br.edu.infnet.domain.entidades.Bebida;

public class ProvedorBebida {
	
	public static Set<Bebida> pegarBebidas() {
		Set<Bebida> bebidas = new TreeSet<>();
		bebidas.add(new Bebida("Suco Laranja", 7f, 1, false, 0.6f, "Vale"));
		bebidas.add(new Bebida("Limonada", 5f, 2, false, 0.5f, "Vale"));
		bebidas.add(new Bebida("Cerveja Brahma Duplo Malte", 5.5f, 3, false, 0.35f, "Brahma"));

		return bebidas;	
	}
}
