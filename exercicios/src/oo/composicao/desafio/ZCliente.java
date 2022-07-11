package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class ZCliente {
	
	String nome;
	List<ZCompra> compras = new ArrayList<>();
	
	ZCliente(String nome) {
		this.nome = nome;
	}

	void adicionarCompra(ZCompra compra) {
		this.compras.add(compra);
	}
	
	double obterValorTotal() {
		double total = 0;
		for(ZCompra compra: compras) {
			total += compra.obterValorTotal();
		}
		return total; 
	}
	
}
