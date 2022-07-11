package exercicio2;

import java.util.Scanner;

public class Desa1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual numero quer dobrar: " );
		int inteiro = sc.nextInt();
		
		System.out.println(devolveDobro(inteiro));
		
		sc.close();
	}
	
	public static int devolveDobro(int inteiro) {
		return inteiro * 2;
	}

}
