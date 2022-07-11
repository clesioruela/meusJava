package listas;

public class OrdenaAlfa {

	public static void main(String[] args) {

		String names[] = { "Raul", "Paulo", "Gionvani", "Rita", "Amanda"
				, "Andrea", "Zara" };
		int n = names.length;
		String temp;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {

				// to compare one string with other strings
				if (names[i].compareTo(names[j]) > 0) {
					// swapping
					temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}

		// print output array
		System.out.println("Os nomes em ordem alfabéticas são: \n");
		for (int i = 0; i < n; i++) {
			System.out.println(names[i]);
		}
	}

}
