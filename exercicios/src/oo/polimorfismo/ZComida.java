package oo.polimorfismo;

public class ZComida {
	
	private double peso;

	public ZComida(double peso) {
		setPeso(peso);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;
		}
	}


}
