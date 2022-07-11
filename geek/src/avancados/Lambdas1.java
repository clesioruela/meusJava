package avancados;

import java.util.ArrayList;
import java.util.List;

public class Lambdas1 {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();

		ComparadorPorTamanho comparador = new ComparadorPorTamanho();

		palavras.add("z");
		palavras.add("Java");
		palavras.add("C#");
		palavras.add("PHP");
		palavras.add("Python");
		palavras.add("Abraçariamos");
		palavras.add("Abc");
		palavras.add("Kotlin");

		palavras.sort(comparador);

		palavras.forEach(pl -> System.out.println(pl));
	}
}
