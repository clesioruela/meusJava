package exercicio;

import java.util.Scanner;

public class DivisoresDeInteiro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Qual o numero: ");
		int numero = sc.nextInt();

		System.out.println("\nCrescente " + numero);
		for (int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println("\n\nDecrescente " + numero);
		for (int j = numero - 1; j > 0; j--) {
			if (numero % j == 0) {
				System.out.print(j + " ");
			}
		}
		sc.close();
	}

}
