package oo.composicao;

import java.util.ArrayList;

public class Compra {

	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));
	}
	
	void adicionarItem(Item item) {
		this.itens.add(item);
		item.compra = this;
	}
	
	double obterValorTotal() {
		double total = 0;
		double totag;
		for(Item item: itens) {
			totag = item.quantidade * item.preco;
			System.out.println(item.nome + " / " + item.quantidade + " / " + item.preco + " = " + totag);
			total += item.quantidade * item.preco;
		}
		
		return total;
	}
}
