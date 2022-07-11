package exercicio;

import java.util.Scanner;

public class Desa5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;
		int soma = 0;
		int cont = 0;
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i + 1) + "o número: ");
			num = sc.nextInt();
			if (num > -1) {
				soma += num;
				cont++;
			}
		}
		
		int media = soma / cont;
		System.out.println("\nA soma de " + cont + " núm é :" + soma 
				+ " e a média é " + media );
		sc.close();

	}

}
