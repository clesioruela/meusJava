package avancados;

import java.util.ArrayList;
import java.util.List;

public class Streams4 {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(new Curso("Algoritmos e Lógica de Programa", 280));
		cursos.add(new Curso("Programação para Leigos", 1700));
		cursos.add(new Curso("Programação em C: Essencial", 125));
		cursos.add(new Curso("Programação em Java: Essencial", 10));
		cursos.add(new Curso("Programação em Python: Essencial", 3));
		cursos.add(new Curso("Banco de Dados: Essencial", 0));

		cursos.stream()
			.filter(c -> c.getquantidadeAlunos() >= 100)
			.findFirst()
			.ifPresent(System.out::println);

	}

}
