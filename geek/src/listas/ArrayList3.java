package listas;

import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {

		ArrayList<Clientes> clientes = new ArrayList<>();

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

		// Collections.sort(clientes);

	}
}
