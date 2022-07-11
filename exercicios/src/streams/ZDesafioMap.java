package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ZDesafioMap {
	/*
	 * 1. Número para string binária... 6 => "110"
	 * 2. Inverter a string... "110" => "011"
	 * 3. Converter de volta para inteiro => "011" => 3
	 */	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 40);
		
		//String paraBinario = Integer.toBinaryString(40);
		//int paraInteiro = Integer.parseInt("101000", 2);
		
		UnaryOperator<String> inverter = 
				s -> new StringBuilder(s).reverse().toString();
				
		Function<String, Integer> binaToInt = n -> Integer.parseInt(n, 2); 
				
		nums.stream()
			.forEach(System.out::println);

		nums.stream()
		.map(Integer::toBinaryString)
		.map(inverter)
		.map(binaToInt)
		.forEach(System.out::println);

		System.out.println();
		nums.stream()
		.map(Integer::toBinaryString)
		.map(inverter)
		.map(inverter)
		.map(binaToInt)
		.forEach(System.out::println);
		
	}

}
