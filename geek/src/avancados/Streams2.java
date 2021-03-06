package avancados;

import java.util.ArrayList;
import java.util.List;

public class Streams2 {
	
	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(new Curso("Programação para Leigos", 170));
		cursos.add(new Curso("Algoritmos e Lógica de", 280));
		cursos.add(new Curso("Programação em C: Essencial", 125));
		cursos.add(new Curso("Programação em Java: Essencial", 0));
		cursos.add(new Curso("Programação em Python: Essencial", 0));
		cursos.add(new Curso("Banco de Dados: Essencial", 0));
		
		cursos.stream()
			.filter(c -> c.getquantidadeAlunos() >= 100)
			.map(Curso::getquantidadeAlunos)//ele mapeia um tipo de dado para outro
			.forEach(System.out::println);
	}

}
