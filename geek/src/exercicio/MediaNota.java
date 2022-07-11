package exercicio;

import java.util.Scanner;

public class MediaNota {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nota = 10;
		double cont = 0;
		int totalNota = 0;
		while (nota > 9 && nota < 21) {
			System.out.print("Digite a nota : ");
			nota = sc.nextInt();
			if (nota > 9 && nota < 21) {
				cont++;
				totalNota += nota;
			} else {
				System.out.println(nota + " fora do intervalo, desconsiderado");
			}
		}
		
		System.out.println(totalNota + " / " + cont);
		System.out.println("A média é " + totalNota / cont);
		
		sc.close();
	}

}
