package exercicio2;

import java.util.Scanner;

public class Desa3 {

	static String nomeMes;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual o dia: ");
		int dia = sc.nextInt();
		System.out.print("Qual o mes: ");
		int mes = sc.nextInt();
		System.out.print("Qual o ano: ");
		int ano = sc.nextInt();
		
		System.out.println(formataData(dia, mes, ano));
		
		sc.close();
		

	}

	static String formataData(int dia, int mes, int ano) {
		
		String[] nomeMes = { "Janeiro", "Fevereiro", "Março", "Abril"
				, "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro"
				, "Novembro", "Dezembro" };
		
		return dia + " de " + nomeMes[mes - 1] + " de " + ano;
	}

}