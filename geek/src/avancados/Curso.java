package avancados;

public class Curso {

	private String nome;
	private int quantidadeAlunos;

	public Curso(String nome, int quantidadeAlunos) {
		this.nome = nome;
		this.quantidadeAlunos = quantidadeAlunos;
	}

	public String getNome() {
		return this.nome;
	}

	public int getquantidadeAlunos() {
		return this.quantidadeAlunos;
	}

	@Override
	public String toString() {
		return this.quantidadeAlunos + " " + this.nome;
	}
}
