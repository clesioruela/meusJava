package exercicio2;

import java.util.Scanner;

public class Desa2 {

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

		switch (mes) {
		case 1:
			nomeMes = "Janeiro";
			break;
		case 2:
			nomeMes = "Fevereiro";
			break;
		case 3:
			nomeMes = "Março";
			break;
		case 4:
			nomeMes = "Abril";
			break;
		case 5:
			nomeMes = "Maio";
			break;
		case 6:
			nomeMes = "Junho";
			break;
		case 7:
			nomeMes = "Julho";
			break;
		case 8:
			nomeMes = "Agosto";
			break;
		case 9:
			nomeMes = "Setembro";
			break;
		case 10:
			nomeMes = "Outubro";
			break;
		case 11:
			nomeMes = "Novembro";
			break;
		case 12:
			nomeMes = "Dezembro";
			break;
		default:
			nomeMes = "Mes Inexiste... ";
//			break;
    		}
		return dia + " de " + nomeMes + " de " + ano;
	}

}
