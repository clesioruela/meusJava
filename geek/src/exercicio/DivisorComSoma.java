package exercicio;

import java.util.Scanner;

public class DivisorComSoma {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Qual o numero: ");
		int numero = sc.nextInt();

		int somaTotal=0;
		for (int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				System.out.print(i + " ");
				somaTotal += i;
			}
		}
		System.out.println("\nSoma " + somaTotal);

		somaTotal = 0;
		System.out.println("\n\nDecrescente " + numero);
		for (int j = numero - 1; j > 0; j--) {
			if (numero % j == 0) {
				System.out.print(j + " ");
				somaTotal += j;
			}
		}
		System.out.println("\nSoma " + somaTotal);
		
		sc.close();
	}


}
