package exercicio2;

public class SomaNumInt2 {
	
	public static void main(String[] args) {	


		String texto = "22555";
		int numero = Integer.parseInt(texto);
		byte[] digitos = extrairDigitos(numero);
		long soma = 0;
		for (byte digito : digitos) {
		    soma += digito;
		}
		System.out.println("A soma dos digitos de " + numero + " é " + soma);
	

	}
	
	public static byte[] extrairDigitos(long numero) {
	    if (numero < 0) {
	        System.out.println("numero não pode ser negativo");
	    }
	    if (numero < 10) {
	        return new byte[] { (byte) numero };
	    }
	    byte[] digitos = new byte[(int) Math.log10(numero) + 1];
	    for (int i = digitos.length - 1; i >= 0; i--) {
	        digitos[i] = (byte) (numero % 10);
	        numero = numero/10;
	    }
	    return digitos;
	}

}
