package avancados;

import java.util.Comparator;

public class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String st1, String st2) {
		if (st1.length() < st2.length()) {
			return 1;
		} else if (st1.length() > st2.length()) {
			return -1;
		} else {
			return 0;			
		}
	}

}
