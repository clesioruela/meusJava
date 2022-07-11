package arrays;

import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas notas :");
		int qtdeNotas = entrada.nextInt();
		
		double[] notas = new double[qtdeNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print((i + 1) + "a nota : ");
			notas[i] = entrada.nextDouble();
		}
		
		double totNt = 0;
		for(double vlNota: notas) {
			totNt += vlNota;
		}
		
		System.out.println("Média é " + totNt / notas.length);
	
		entrada.close();
	}
}
