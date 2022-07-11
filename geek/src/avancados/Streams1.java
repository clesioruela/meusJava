package avancados;

import java.util.ArrayList;
import java.util.List;

public class Streams1 {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(new Curso("Programa��o para Leigos", 1700));
		cursos.add(new Curso("Algoritmos e L�gica de Programa", 280));
		cursos.add(new Curso("Programa��o em C: Essencial", 125));
		cursos.add(new Curso("Programa��o em Java: Essencial", 10));
		cursos.add(new Curso("Programa��o em Python: Essencial", 3));
		cursos.add(new Curso("Banco de Dados: Essencial", 0));

		cursos.stream().filter(c -> c.getquantidadeAlunos() >= 100).forEach(c ->
			System.out.println(c.getNome() + " " + c.getquantidadeAlunos()));
		System.out.println();
		cursos.stream()
				.filter(c -> c.getquantidadeAlunos() >= 100)
				.forEach(System.out::println);

	}

}