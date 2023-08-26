package br.edu.infnet.domain.repositorio;

import java.util.HashSet;
import java.util.Set;

import br.edu.infnet.domain.entidades.Comida;

public class ProvedorComida {

	public static Set<Comida> pegarComidasVeganas() {
		Set<Comida> comidasVeganas = new HashSet<>();
		comidasVeganas.add(new Comida("Escondidinho de Mandioquinha com Shimeji e Quinoa", 
				50f, 
				1, 
				400.00f, 
				true, 
				"1 quilograma de mandioquinha com casca\n"
				+ "2 colheres de chá de sal Maríssimo Mãe Terra\n"
				+ "me-terra Logo\n"
				+ "1 colher de sopa de azeite de oliva extra virgem\n"
				+ "100 ml de leite de coco\n"
				+ "2 pitadas de pimenta-do-reino preta moída grossa\n"
				+ "1 pitada de noz-moscada em pó\n"
				+ "Shimeji com Quinoa Grãos\n"
				+ "500 gramas de cogumelo shimeji branco\n"
				+ "1 xícara de quinoa em grãos orgânica Mãe Terra cozida com sal\n"
				+ "1/2 maço de manjericão fresco picado\n"
				+ "1 colher de sopa de folhas tomilho fresco\n"
				+ "1/4 xícara de azeite de oliva extra virgem\n"
				+ "3 dentes de alho picado\n"
				+ "1 colher de chá de sal Maríssimo Mãe Terra"));
		
		comidasVeganas.add(new Comida("Ratatouille​", 
				80f, 
				2, 
				600.00f, 
				true, 
				"1 beringela em rodelas finas\n"
				+ "1 abobrinha grande em rodelas finas\n"
				+ "1 cenoura em rodelas finas\n"
				+ "1 cebola roxa em rodelas finas\n"
				+ "4 tomates não muito maduros fatiados\n"
				+ "1 cebola picada\n"
				+ "2 dentes de alho picados\n"
				+ "2 cubos de Caldo Knorr Zero Sal™ Legumes\n"
				+ "1 colher de café de pimenta-do-reino\n"
				+ "4 colheres de sopa de azeite\n"
				+ "1 tomates em lata pelado (400 g)\n"
				+ "1 xícara de chá de água\n"
				+ "2 folhas de louro fresco\n"
				+ "1 colher de sopa de orégano seco (opcional)"));

		comidasVeganas.add(new Comida("Abobrinha recheada com cuscuz marroquino​", 
				60f, 
				3, 
				350.00f, 
				true, 
				"4 abobrinhas médias bem firmes\n"
				+ "1/2 xícara de chá de cuscuz Marroquino\n"
				+ "1 xícara de chá de água fervente\n"
				+ "1 sachê de Caldo em Pó Knorr Legumes\n"
				+ "1 colher de sopa de azeite\n"
				+ "1 cenoura pequena cortada em cubos\n"
				+ "1 colher de sopa de cebola roxa picada\n"
				+ "2 colheres de sopa de uvas passas escuras\n"
				+ "2 colheres de sopa de hortelã fresca picada\n"
				+ "1 colher de sopa de amêndoas laminadas"));
		
		return comidasVeganas;	
	}
	
	public static Set<Comida> pegarComidasNaoVeganas() {
		Set<Comida> comidasNaoVeganas = new HashSet<>();
		comidasNaoVeganas.add(new Comida("Poke", 40f, 4, 300f, false, 
				"150 gramas de atum cortado em cubos\n"
				+ "1/2 cebola cortada em cubos bem pequenos\n"
				+ "6 colheres de sopa de shoyu\n"
				+ "1 colher de sopa de molho de ostra\n"
				+ "1 colher de sopa de óleo de gergelim\n"
				+ "100 gramas de gohan (arroz japonês cozido)\n"
				+ "Gergelim a gosto\n"
				+ "Cebolinha picada a gosto\n"
				+ "Sal a gosto\n"
				+ "Brotos ou cebolinha para finalizar"));
		
		comidasNaoVeganas.add(new Comida("Espaguete à carbonara", 55f, 5, 400f, false, 
				"350 gramas de macarrão espaguete\n"
				+ "4 a 6 tiras grandes de bacon defumado (ou bacon a gosto)\n"
				+ "3 ovos\n"
				+ "1 gema\n"
				+ "200 gramas queijo minas curado ralado\n"
				+ "Pimenta-do-reino a gosto"));
		
		comidasNaoVeganas.add(new Comida("Strogonoff de frango", 45f, 6, 300f, false, 
				"500 gramas de peito de frango cortado em cubos ou tirinhas\n"
				+ "1 colher de sopa de manteiga\n"
				+ "1/2 cebola picada ou ralada\n"
				+ "Sal e pimenta a gosto\n"
				+ "1/2 xícara de chá de água\n"
				+ "1 caixinha de creme de leite\n"
				+ "6 colheres de sopa de ketchup"));
		
		return comidasNaoVeganas;	
	}	
}
