package classe.desafio;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		
		var d2 = new Data(31, 12, 2014);
		
		System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano);
		System.out.printf("%d/%d/%d\n\n", d2.dia, d2.mes, d2.ano);

		String dataF2 = d2.obterDataFormatada();
		System.out.println(dataF2);
		System.out.println();
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
	}

}
