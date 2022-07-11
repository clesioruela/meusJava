package oo.heranca.desafio;

public interface ZLuxo {
	
	void ligarAr();
	void desligarAr();
	
	default int velocidadeDoAr() {
		return 1;
	}

}
