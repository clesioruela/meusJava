package avancados;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams5 {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(new Curso("Algo e Lógica de Prog ", 280));
		cursos.add(new Curso("Prog para Leigos ", 1700));
		cursos.add(new Curso("Prog em C: Essencial ", 125));
		cursos.add(new Curso("Prog em Java: Essencial ", 10));
		cursos.add(new Curso("Prog em Python: ", 3));
		cursos.add(new Curso("Banco de Dados: ", 0));

		cursos.stream()
			.filter(c -> c.getquantidadeAlunos() <=100)
			.collect(Collectors.toMap(
					c -> c.getNome(),
					c -> c.getquantidadeAlunos()))
			.forEach((nm, qtd) -> System.out.println(qtd + " alunos no curso " + nm));

	}

}
