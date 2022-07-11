package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ZDesafioFilter {
	
	public static void main(String[] args) {
		
	
	ZProduto p1 = new ZProduto("Lapis", 1.99, 0.35, 10);
	ZProduto p2 = new ZProduto("Notebook", 4899.89, 0.32, 0);
	ZProduto p3 = new ZProduto("Caderno", 30, 0.45, 0);
	ZProduto p4 = new ZProduto("Impressora", 1200, 0.41, 0);
	ZProduto p5 = new ZProduto("iPad", 3100, 0.29, 0);
	ZProduto p6 = new ZProduto("Relogio", 1900, 0.12, 50);
	ZProduto p7 = new ZProduto("Monitor", 800, 0.31, 0);
	
	List<ZProduto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
	
	Predicate<ZProduto> descontoMaior = dm -> dm.desconto >= 0.3;
	Predicate<ZProduto> freteGratis = fg -> fg.valorFrete <= 0;
	Predicate<ZProduto> precoReleva = pr -> pr.preco >= 10;
			
	
	Function<ZProduto, String> prodApro =
			pa -> pa.nome + " " + pa.preco + " %Desc " + pa.desconto;
	
	produtos.stream()
		.filter(descontoMaior)
		.filter(freteGratis)
		.filter(precoReleva)
		.map(prodApro)
		.forEach(System.out::println);
	

	}
}
