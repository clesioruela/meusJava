package armazenamento;

import java.util.Arrays;

public class Vetor {
	
	private Aluno alunos[] = new Aluno[100];
	private int total = 0;
	
	public void adionaAluno(Aluno aluno) {
		this.garantirEspaco();
		this.alunos[total] = aluno;
		total ++; 
	}

	public void adicionaAluno(int posicao, Aluno aluno) {
		this.garantirEspaco();
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posi??o inv?lida");
		}
		for (int i = total - 1; i >= posicao; i -= 1) {
			alunos[i + 1] = alunos[i];
		}
		this.alunos[posicao] = aluno;
		total++;
	}
	public Aluno pegaAluno(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posi??o inv?lida");
		}
		return this.alunos[posicao];
	}
	
	public void removeAluno(int posicao) {
		for (int i = posicao; i < this.total; i++) {
			this.alunos[i] = this.alunos[i + 1];
		}
		total--;
	}
	
	public boolean contemAluno(Aluno aluno) {
		for (int i = 0; i < total; i++) {
			if (aluno.equals(alunos[i])) {
				return true;
			}
		}
		return false;
	}
	
	public int quantidade() {
		return this.total;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(this.alunos);
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < total;
	}
	
	private void garantirEspaco() {
		if (total == alunos.length) {
			Aluno novoArray[] = new Aluno[alunos.length * 2];
			for (int i = 0; i < alunos.length; i++) {
				novoArray[i] = alunos[i];
			}
			this.alunos = novoArray;
		}
	}
}
