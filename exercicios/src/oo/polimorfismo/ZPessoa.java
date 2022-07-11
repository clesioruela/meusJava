package oo.polimorfismo;

public class ZPessoa {

	private double peso;

	public ZPessoa(double peso) {
		setPeso(peso);
	}

	public void comer(ZComida comida) {
		this.peso += comida.getPeso();
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
