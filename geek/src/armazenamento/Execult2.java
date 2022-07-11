package armazenamento;

public class Execult2 {
	
	public static void main(String[] args) {
		
		Vetor lista = new Vetor();
		
		for (int i = 0; i < 300; i++) {
			Aluno a = new Aluno("Marr " + i);
			lista.adionaAluno(a);
		}
		
		System.out.println(lista);
		System.out.println(lista.quantidade());
		
	}

}
