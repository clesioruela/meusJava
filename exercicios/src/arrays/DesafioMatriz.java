package arrays;

import java.util.Scanner;

public class DesafioMatriz {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Quantos alunos: ");
		int qtdeAlu = entrada.nextInt();

		System.out.print("Quantas notas por aluno: ");
		int qtdeNota = entrada.nextInt();
		
		double [][] notasTurma = new double[qtdeAlu][qtdeNota];
		
 		double totNotas = 0;
 		double [] notaPorAluno = new double[qtdeAlu];

 		for (int a = 0; a < notasTurma.length; a++) {

			notaPorAluno[a] = 0;
			
			for (int n = 0; n < notasTurma[a].length; n++) {
				
				System.out.printf("Informe a nota %d do aluno %d: ", (n + 1), (a + 1));
				notasTurma[a][n] = entrada.nextDouble();
				totNotas += notasTurma[a][n];
				notaPorAluno[a] += notasTurma[a][n];
				
				//System.out.println(notaPorAluno[a] + " a> " + a + " n> " + n);
			}

		}
 		double medAlu = 0;
 		for (int i = 0; i < notaPorAluno.length; i++) {
 			System.out.println("Total de notas aluno " + (i + 1) + " = " + notaPorAluno[i]);
 			medAlu = notaPorAluno[i] / qtdeNota;
 			System.out.println("Média deste aluno " + medAlu);
 			System.out.println();
 		}
		
 		double media = totNotas / (qtdeAlu * qtdeNota);
		System.out.println("A média da turma é " + media);
 		entrada.close();
	}

}
