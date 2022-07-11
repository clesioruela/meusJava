package lambdas;

public class ZCalculoTeste2 {
	
	public static void main(String[] args) {
		
		ZCalculo calc = (a, b) -> { return a + b; };
		System.out.println(calc.executar(30, 100));

		calc = (x, y) -> x * y;
		
		System.out.println(calc.executar(30, 100));
	}

}
