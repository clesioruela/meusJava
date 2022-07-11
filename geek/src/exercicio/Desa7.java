package exercicio;

import java.util.Scanner;

public class Desa7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual o numero: ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num + 1; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		
		
		
		sc.close();
	}

}
