package avancados;

import java.util.ArrayList;
import java.util.List;

public class Lambdas2 {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();

		palavras.add("z");
		palavras.add("Java");
		palavras.add("C#");
		palavras.add("PHP");
		palavras.add("Python");
		palavras.add("Abra�ariamos");
		palavras.add("Abc");
		palavras.add("Kotlin");

		palavras.sort((st1, st2) -> {
			if (st1.length() < st2.length()) {
				return -1;
			} else if (st1.length() > st2.length()) {
				return 1;
			} else {
				return 0;
			}
		});
	
		
		palavras.sort((st1, st2) ->
			Integer.compare(st1.length(), st2.length())
		);

		palavras.forEach(pl -> System.out.println(pl));
	}

}