package exercicio;

import java.util.Scanner;

public class SomaDeNumeros {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1o Numero do Intervalo : ");
		int priNumero = sc.nextInt();

		System.out.print("2o Numero do Intervalo : ");
		int ultNumero = sc.nextInt();

		int somaPar = 0 ;
		int somaImpar = 0 ;
		if (priNumero < ultNumero ) {
			for (int i = priNumero; i < ultNumero; i++) {
				if (i % 2 == 0) {
					somaPar += i;
					System.out.print(i + " ");
				} else {
					somaImpar += i;
					System.out.print(i + " ");
				}
			}
			System.out.println("\nIntervalo entre " + priNumero + " e " + ultNumero+ "\n\n");
			System.out.println("A soma de valores pares é: " + somaPar);
			System.out.println("A soma de valores impares é: " + somaImpar);			
		}
		
		
		
		sc.close();
	}

}
