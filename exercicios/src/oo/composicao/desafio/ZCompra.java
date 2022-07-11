package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class ZCompra {
	
	List<ZItem> itens = new ArrayList<>();
	
	void adicionarItem(ZProduto p, int qtde) {
		this.itens.add(new ZItem(p, qtde));
	}
	
	void adicionarItem(String nome, double preco, int qtde) {
		var produto = new ZProduto(nome, preco);
		this.itens.add(new ZItem(produto, qtde));
	}
	
	double obterValorTotal() {
		double total = 0;
		for(ZItem item: itens) {
			total += item.quantidade * item.produto.preco;
		}
		return total; 
	}

}
