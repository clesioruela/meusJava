package exercicio2;

import java.util.Scanner;

public class SomaNumInt1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Numero para somar algarismos: ");

		String numStribg = sc.next();
		System.out.println(somaAlgarismos(numStribg));

		sc.close();

	}

	public static String somaAlgarismos(String numeroString) {
		
		char[] chars = numeroString.toCharArray();
		int soma = 0;
		for (char tex : chars) {
			int myInt = Character.getNumericValue(tex);
			soma += myInt;
		}
		return "A soma dos digitos de " + soma;

	}

}
