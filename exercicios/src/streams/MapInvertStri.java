package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class MapInvertStri {

	public static void main(String[] args) {

		List<String> noms = 
				Arrays.asList("ABC", "Clesio", "Matheus", "Leida", "João", "123");
		UnaryOperator<String> inverter =
				s -> new StringBuilder(s).reverse().toString();
		
		noms.stream().map(inverter).forEach(System.out::println);
		
		System.out.println();
		noms.stream().map(inverter).map(inverter).forEach(System.out::println);

	}

}
