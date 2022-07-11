package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Comida c1 = new Comida("Arroz", 0.180);
		Comida c2 = new Comida("Feij�o", 0.300);
		Comida c3 = new Comida("Feij�o", 7.300);
		
		Pessoa p = new Pessoa("Jo�o", 99.8);
		
		System.out.println(p.apresentar());
		p.comer(c1);

		System.out.println(p.apresentar());
		p.comer(c2);

		System.out.println(p.apresentar());
		p.comer(c3);
		System.out.println(p.apresentar());
	}
}
