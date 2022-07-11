package exercicio;

import java.util.Scanner;

public class Desa6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num;
		int maiorValor = 0;
		int menorValor = 0;
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i + 1) + "o número: ");
			num = sc.nextInt();
			
			if (i == 0) {
				menorValor = num;
			}
			
			if (num > maiorValor) {
				maiorValor = num;
			} else if (num < menorValor) {
				menorValor = num;
			}
		}
		
		System.out.println("\nO maior valor é " + maiorValor);
		System.out.println("\nO menor valor é " + menorValor);
		sc.close();
		
	}

}
