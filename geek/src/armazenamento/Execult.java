package armazenamento;

public class Execult {

	public static void main(String[] args) {

		
		Aluno a1 = new Aluno("Bertinho Marco");
		Aluno a2 = new Aluno("Mirta Marta");
		Aluno a3 = new Aluno("Abel Ferreira");
		Aluno a4 = new Aluno("Luciana Freitas");
		Aluno a5 = new Aluno("Tito Moura");
		
		Vetor lista = new Vetor();
		
		System.out.println("Total de alunos : " + lista.quantidade());
		
		lista.adionaAluno(a1);
		System.out.println("Total de alunos : " + lista.quantidade());
		lista.adionaAluno(a2);
		lista.adionaAluno(a3);
		lista.adionaAluno(a4);
		lista.adionaAluno(a5);
		System.out.println("Total de alunos : " + lista.quantidade());
		
		
		System.out.println(lista);
		
		System.out.println(lista.contemAluno(a2));
		
		try {
			System.out.println(lista.pegaAluno(3));			
		} catch (IllegalArgumentException e) {
			System.out.println("O aluno da posi??o escolhida n?o existe");
			System.out.println(e.getMessage());
		}
		
		Aluno a6 = new Aluno("Bartira ferraz");
		try {
			lista.adicionaAluno(2, a6);			
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(lista);
		
		lista.removeAluno(4);
		System.out.println(lista);
		
		
	}

}
