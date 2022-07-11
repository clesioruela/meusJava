package oo.composicao.desafio;

public class ZSistema {
	
	public static void main(String[] args) {
		
		ZCliente cliente1 = new ZCliente("Antonio Conti");
		
		ZCliente cliente2 = new ZCliente("Marieta Lombardi");
		
		ZCompra compra1 = new ZCompra();
		compra1.adicionarItem("Mala", 195.5, 3);
		compra1.adicionarItem("Jaqueta", 455.99, 5);
		compra1.adicionarItem(new ZProduto("Notebook", 1987.88), 2);
		
		ZCompra compra2 = new ZCompra();
		compra2.adicionarItem("Pincel", 5.52, 10);
		compra2.adicionarItem("Cueca", 101.99, 1);
		compra2.adicionarItem(new ZProduto("Caderno", 17.01), 2);

		ZCompra compra3 = new ZCompra();
		compra3.adicionarItem("Taco", 99.99, 10);
		compra3.adicionarItem("Cinto", 55.1, 1);

		cliente1.compras.add(compra1);
		cliente1.compras.add(compra2);
		
		cliente2.compras.add(compra2);
		cliente2.adicionarCompra(compra3);
		
		System.out.println(cliente1.nome + " " + cliente1.obterValorTotal());
		System.out.println(cliente2.nome + " " + cliente2.obterValorTotal());
		
	}

}
