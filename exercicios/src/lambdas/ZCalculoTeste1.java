package lambdas;

public class ZCalculoTeste1 {
	
	public static void main(String[] args) {
		
		ZCalculo calculo = new ZSomar();
		System.out.println(calculo.executar(2, 5));
		
		calculo = new ZMultiplicar();
		System.out.println(calculo.executar(5, 3));
		
	}

}
