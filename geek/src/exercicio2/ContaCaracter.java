package exercicio2;

public class ContaCaracter {
	
	public static void main(String[] args) {
		
		ContaCaracter des = new ContaCaracter();
		des.hellodesafio();
		System.out.println(des.hellodesafio("tres"));
		System.out.println(des.somaDois(10, 25));
		System.out.println(des.somaTres(2.0, 5.4, 10.0));
		System.out.println(des.qtdecarac("Clesio alves ruela"));
		System.out.println(des.qtdecarac("Matheus Gomes Ruela"));
		
	}
	
	private String qtdecarac(String nome) {
		return "a palavra possui " + nome.length() + " caracteres";
	}
	
	public void hellodesafio() {
		System.out.println("AloMundo!!!");
	}
	
	public String hellodesafio(String nome) {
		Integer tam = nome.length();
		String strn = String.valueOf(tam);
		return "a palavra possui " + strn + " caracteres";
	}
	
	public Integer somaDois(Integer a, Integer b) {
		return a + b;
	}

	public Double somaTres(Double x, Double y, Double z) {
		Double tot = ((x + y) * x) / z;
		return tot;
	}

}
