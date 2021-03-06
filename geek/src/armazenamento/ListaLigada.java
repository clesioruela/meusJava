package armazenamento;

public class ListaLigada {
	
	private Celula primeira = null;
	private Celula ultima = null;
	private int total = 0;
	
	public void adicionaNoComeco(Object elemento) {
		Celula nova = new Celula(elemento, this.primeira);
		this.primeira = nova;
		
		if (this.total == 0) {
			this.ultima = this.primeira;
		}
		this.total++;
	}
	
	public void adiciona(Object elemento) {
		if (this.total == 0) {
			this.adicionaNoComeco(elemento);
		}
		Celula nova =  new Celula(elemento, null);
		this.ultima.setProximo(nova);
		this.ultima = nova;
		this.total = this.total + 1;
	}	
	
	public void adiciona(int posicao, Object elemento) {
		
	}
	
	public Object posicaopega(int posicao) {
		return null;
	}
	
	public void remove(int posicao) {
		
	}
	
	public int tamanho() {
		return 0;
	}
	
	public boolean contem(Object obj) {
		return false;
	}

	@Override
	public String toString() {
		if (total == 0) {
			return "[]";
		}
		Celula atual = primeira;
		StringBuilder varbuilder = new StringBuilder("[");
		
		for (int i = 0; i < total; i++) {
			varbuilder.append(atual.getElemento());
			varbuilder.append(",");
			
			atual = atual.getProximo();
		}
		varbuilder.append("]");
		return varbuilder.toString();
	}
	
	
}
