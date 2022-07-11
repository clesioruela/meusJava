package exercicio2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class GravaEmArquivoExistente {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			PrintStream escrever = new PrintStream(new FileOutputStream("saida.txt", true));
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
		} catch (FileNotFoundException e) {
			System.out.println("Não foi possivel criar o arquivo!");
		}

		sc.close();
	}

}
