package listas;

import java.util.HashSet;
import java.util.Set;

public class Conjuntos {
	
	public static void main(String[] args) {
		
		
		
		Set<String> nomes = new HashSet<>();
		nomes.add("Gabirelo");
		nomes.add("Zelia");
		nomes.add("Marcio");
		nomes.add("Andre");
		nomes.add("Marcio");
		
		for (String nome : nomes) {
			System.out.println(nome);
		}

		System.out.println();
		
		Set<Clientes> clientes = new HashSet<>();
		
		Clientes cl1 = new Clientes("Marta Rocha", "Rua da maria, 188");
		Clientes cl2 = new Clientes("Armando Caio", "Rua da maria, 188");
		Clientes cl3 = new Clientes("Zelia Moura", "Rua da maria, 188");

		clientes.add(cl1);
		clientes.add(cl2);
		clientes.add(cl3);
		
		for (Clientes cli : clientes) {
			System.out.println(cli.nome);
			System.out.println(cli.endereco);
		}
		
		
		System.out.println("---------------------------------------------");
		
		for (Clientes cli : clientes) {
			System.out.println(cli);
		}
	}

}
