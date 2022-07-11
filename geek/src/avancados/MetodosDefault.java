package avancados;

import java.util.ArrayList;
import java.util.List;

public class MetodosDefault {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		
		ComparadorPorTamanho cptm = new ComparadorPorTamanho();

		palavras.add("z");
		palavras.add("Java");
		palavras.add("C#");
		palavras.add("PHP");
		palavras.add("Python");
		palavras.add("Aaaaasssdsfsdbc");
		palavras.add("Abc");
		palavras.add("Kotlin");
		
		//Collections.sort(palavras, cptm);
		palavras.sort(cptm);
		for (int i = 0; i < palavras.size(); i++) {
			System.out.println("A palavra " + palavras.get(i) + " tem " + palavras.get(i).length() + " caracteres");

		}
		System.out.println("\n" + palavras);

	}

}
