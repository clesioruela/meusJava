package oo.heranca.desafio;

public class ZFerrari extends ZCarro implements ZEsportivo,ZLuxo {

	private boolean ligarTurbo = false;
	private boolean ligarAr = false;
	
	ZFerrari() {
		this(315);
	}

	ZFerrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}
	
	@Override
	public void ligarAr() {
		ligarAr = true;
	}
	
	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		if (ligarTurbo && !ligarAr) {
			return 35;
		} else if (ligarTurbo && ligarAr) {
			return 30;
		} else if (!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;
		}
	}
	
//	@Override // sobrescreve método na classe pai (ZCarro)
//	void acelerar() {
//		velocidadeAtual += 50;
//	}
}
