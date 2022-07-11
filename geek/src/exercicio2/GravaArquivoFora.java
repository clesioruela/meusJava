package exercicio2;

import java.io.PrintStream;
import java.util.Scanner;

public class GravaArquivoFora {

	public static void main(String[] args) {

		// comparar uma pessoa a ninguem
		Scanner sc = new Scanner(System.in);
		try {
			PrintStream escrever = new PrintStream("saida.txt");
			boolean sair = false;
			String msg;
			while (sair == false) {
				System.out.print("Escreva algo: ou 'Sair': ");
				msg = sc.nextLine();
				if (msg.equalsIgnoreCase("sair")) {
					sair = true;
				}
				
				escrever.println(msg);
			}

			escrever.close();
		} catch (Exception e) {
			System.out.println("Não foi possivel criar o arquivo!");
		}

		sc.close();
	}

}
