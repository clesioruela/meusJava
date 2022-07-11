package oo.heranca.desafio;

public class ZCarroteste {
	
	public static void main(String[] args) {
		
		ZCarro c1 = new ZCivic();
		
		c1.acelerar();
		c1.acelerar();
		System.out.println(c1);
		c1.frear();
		System.out.println(c1);

		c1.acelerar();
		c1.acelerar();
		System.out.println(c1);

		c1.acelerar();
		System.out.println(c1);
		System.out.println();
		
		ZFerrari c2 = new ZFerrari(400);
		c2.ligarTurbo();
		c2.ligarAr();
		c2.desligarAr();
		
		System.out.println("vel ar " + c2.velocidadeDoAr());
		
		c2.acelerar();
		System.out.println(c2);
		
		c2.acelerar();
		System.out.println(c2);

		c2.acelerar();
		c2.acelerar();
		System.out.println(c2);
		c2.frear();
		c2.frear();
		c2.frear();
		System.out.println(c2);
		
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		System.out.println(c2);

	}
	

}
