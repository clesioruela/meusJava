package avancados;

import java.util.ArrayList;
import java.util.List;

public class ForEach1 {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		
		ForEachImpNaLinha consume = new ForEachImpNaLinha();

		ComparadorPorTamanho cptm = new ComparadorPorTamanho();

		palavras.add("z");
		palavras.add("Java");
		palavras.add("C#");
		palavras.add("PHP");
		palavras.add("Python");
		palavras.add("Aaaaasssdsfsdbc");
		palavras.add("Abc");
		palavras.add("Kotlin");

		//System.out.println("\n" + palavras + "\n");

		palavras.stream()
			.sorted(cptm)
			.forEach(n1 -> {
			System.out.println("stream " + n1);
		});
		
		System.out.println();
		
		palavras.forEach(consume);
		
	}

}
