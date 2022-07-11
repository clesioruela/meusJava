package exercicio;

import java.util.Scanner;

public class Desa4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num;
		int soma = 0;
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i + 1) + "o número: ");
			num = sc.nextInt();
			soma += num;
		}
		
		int media = soma / 10;
		System.out.println("\n A soma é :" + soma 
				+ " e a média é " + media );
		sc.close();
		
	}

}
