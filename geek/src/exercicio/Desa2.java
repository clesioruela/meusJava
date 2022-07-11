package exercicio;

public class Desa2 {

	public static void main(String[] args) {

		System.out.println("Com for...");
		for (int i = 0; i < 3; i++) {
			System.out.print((i + 1) + " - ");
			for (int j = 0; j < 100; j++) {
				System.out.print((j + 1) + " ");
			}
			System.out.println();
		}

		System.out.println("\nCom while...");
		int cont1 = 0;
		int cont2;
		while (cont1 < 3) {
			cont2 = 0;
			cont1++;
			System.out.print((cont1) + " - ");
			while (cont2 < 100) {
				cont2++;
				System.out.print(cont2 + " ");
			}
			System.out.println();
		}

	}

}
