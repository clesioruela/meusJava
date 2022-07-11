package lambdas;

import java.util.function.BinaryOperator;

public class ZCalculoTeste3 {
	
	public static void main(String[] args) {
		
		BinaryOperator<Double> calc = (a, b) -> { return a + b; };
		System.out.println(calc.apply(30.0, 10.0));

		calc = (x, y) -> x * y;
		
		System.out.println(calc.apply(30.0, 10.0));
	}


}
