package avancados;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Anonimas {
	
	public static void main(String[] args) {
		
	List<String> palavras = new ArrayList<>();
		

		Consumer<String> consumidor = new Consumer<String>() {
			
			@Override
			public void accept(String st) {
				System.out.println(st);
				
			}
		};
		
		ComparadorPorTamanho comparador = new ComparadorPorTamanho();

		palavras.add("z");
		palavras.add("Java");
		palavras.add("C#");
		palavras.add("PHP");
		palavras.add("Python");
		palavras.add("Abrašariamos");
		palavras.add("Abc");
		palavras.add("Kotlin");

		palavras.sort(comparador);
		
		System.out.println("------------------------------------");
		palavras.forEach(consumidor);
	}

}
