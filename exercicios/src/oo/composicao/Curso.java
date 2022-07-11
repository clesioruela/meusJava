package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	final String nome;
	final List<Aluno> alunos = new ArrayList<>();

	Curso(String nome) {
		this.nome = nome;
	}

	void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}

	Aluno obterAlunoPorNome(String nome) {
		for (Aluno aluno : this.alunos) {
			if (aluno.nome.equalsIgnoreCase(nome)) {
				return aluno;
			}
		}
		return null;
	}

	public String toString() {
		return nome;
	}
}
