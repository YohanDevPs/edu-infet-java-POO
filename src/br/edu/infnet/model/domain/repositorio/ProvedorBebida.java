package br.edu.infnet.model.domain.repositorio;

import java.util.HashSet;
import java.util.Set;

import br.edu.infnet.model.domain.Bebida;

public class ProvedorBebida {
	
	public Set<Bebida> pegarBebidas() {
		Set<Bebida> bebidasGeladas = new HashSet<>();
		bebidasGeladas.add(new Bebida("Suco Laranja", 300f, 1, false, 1, "Vale"));
		bebidasGeladas.add(new Bebida("Limonada", 300f, 2, false, 1, "Vale"));
		bebidasGeladas.add(new Bebida("Cerveja Brahma Duplo Malte", 350f, 3, false, 1, "Brahma"));

		return bebidasGeladas;	
	}
}
