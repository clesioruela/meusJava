package avancados;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class MethodReference {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();

		palavras.add("z");
		palavras.add("Java");
		palavras.add("C#");
		palavras.add("PHP");
		palavras.add("Python");
		palavras.add("Abraçariamos");
		palavras.add("Abc");
		palavras.add("Kotlin");

		// palavras.sort(Comparator.comparing(s -> s.length()));

		// Method reference - Forma 1
		// palavras.sort(Comparator.comparing(String::length));

		// Method reference - Forma 2
		// Function<String, Integer> tamanho = String::length; //Usando Method
		// References
		Function<String, Integer> tamanho = s -> s.length(); // Usando expressão lambda
		Comparator<String> comparador = Comparator.comparing(tamanho);
		palavras.sort(comparador);

		// System.out.println(palavras);

		palavras.forEach(System.out::println); // Method references

	}
}
