package listas;

public class Clientes {
	
	String nome;
	String endereco;
	
	public Clientes(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "nome: " + nome; // + "\nEndereco: " + endereco;
	}
	
	

}
