package avancados;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams6 {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(new Curso("Progpara Leigos", 170));
		cursos.add(new Curso("Lógica de Progo: Essencial", 280));
		cursos.add(new Curso("Prog em C: Essencial", 125));
		cursos.add(new Curso("Prog em Java: Essencial", 0));
		cursos.add(new Curso("Prog em Python: Essencial", 10));
		cursos.add(new Curso("Banco de Dados: Essencial", 2));

		cursos.parallelStream().filter(c -> c.getquantidadeAlunos() > 10)
				.collect(Collectors.toMap(c -> c.getNome(), c -> c.getquantidadeAlunos()))
				.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));

	}
}
