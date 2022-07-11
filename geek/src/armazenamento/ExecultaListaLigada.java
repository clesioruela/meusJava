package armazenamento;

public class ExecultaListaLigada {

	public static void main(String[] args) {

		ListaLigada lista = new ListaLigada();
		
		System.out.println(lista);
		
		lista.adicionaNoComeco("Anamaria");
		System.out.println(lista);

		lista.adicionaNoComeco("Bonfic");
		System.out.println(lista);

		lista.adiciona("Cassio");
		lista.adiciona(125);
		System.out.println(lista);
	}

}
