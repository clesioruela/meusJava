package oo.polimorfismo;

public class Zjantar {
	
	public static void main(String[] args) {
		
			ZPessoa convidado1 = new ZPessoa(99.5);
			
			ZArroz ing1 = new ZArroz(0.25);
			ZFeijao ing2 = new ZFeijao(0.180);
			
			System.out.println(convidado1.getPeso());
			
			convidado1.comer(ing1);
			System.out.println(convidado1.getPeso());

			convidado1.comer(ing2);
			System.out.println(convidado1.getPeso());

			ZSorvete ing3 = new ZSorvete(0.95);
			
			convidado1.comer(ing3);
			convidado1.comer(ing3);
			convidado1.comer(ing3);
			convidado1.comer(ing3);
			System.out.println(convidado1.getPeso());
	}

}
