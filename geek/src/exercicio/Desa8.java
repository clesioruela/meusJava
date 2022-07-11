package exercicio;

import java.util.Scanner;

public class Desa8 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros: ");
		int num = sc.nextInt();
		
		int soma = 0;
		for (int i = 0; i < num + 1; i++) {
			if (i % 2 == 0) {
				soma += i;				
				System.out.print(i + " ");
			}
			
		}
		int soma1 = 0;
		System.out.println();
		for (int i = 0; i < num + 1; i++) {
			if (i % 2 != 0) {
				soma1 += i;				
				System.out.print(i + " ");
			}
			
		}
		
		System.out.println("\nA soma dos pares é " + soma);		
		System.out.println("A soma dos impares é " + soma1);		
		sc.close();
	}


}
