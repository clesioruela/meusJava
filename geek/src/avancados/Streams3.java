package avancados;

import java.util.ArrayList;
import java.util.List;

public class Streams3 {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(new Curso("Programa??o para Leigos", 170));
		cursos.add(new Curso("Algoritmos e L?gica de Programa?", 280));
		cursos.add(new Curso("Programa??o em C: Essencial", 500));
		cursos.add(new Curso("Programa??o em Java: Essencial", 2));
		cursos.add(new Curso("Programa??o em Python: Essencial", 190));
		cursos.add(new Curso("Banco de Dados: Essencial", 10));

		int soma = cursos.stream().filter(c -> c.getquantidadeAlunos() >= 200)
				// MapToInt Permite que possamos efetuar c?lculos com o resultado
				.mapToInt(Curso::getquantidadeAlunos).sum();

		System.out.println("Soma de todos os cursos " + soma);
	}

}
