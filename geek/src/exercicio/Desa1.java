package exercicio;

import java.util.Scanner;

public class Desa1 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual numero quer saber os multiplos :");
		int numeroEscolhido = sc.nextInt();

		System.out.print("\nQuantos multiplos :");
		int quantosNumeros = sc.nextInt();
		
		int contador = 1;
		for(int i = 1; contador < quantosNumeros + 1 ; i++) {
			//System.out.println(i);
			if (i % numeroEscolhido == 0) {
				System.out.println(i + " é multiplo de " + numeroEscolhido);
				contador++;
			}
		}
			
			
		sc.close();
	}

}
