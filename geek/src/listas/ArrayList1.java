package listas;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
	
	public static void main(String[] args) {

		
		ArrayList<String> nomes = new ArrayList<>();
		
		nomes.add("Carlo");
		nomes.add("Amorim");
		nomes.add("Tercio");
		//nomes.add(789);
		//nomes.add(true);
		//nomes.add(121125.0);
		nomes.add("Mauro");
		nomes.add("Cle");
		nomes.add("Aldo");
		nomes.add("Ivo");
		
		System.out.println(nomes.get(1));
		System.out.println(nomes.get(6));
		System.out.println();
		
		//for (int i = 0; i < nomes.size(); i++) {
			//System.out.println(nomes.get(i));
		//}
		
		Collections.sort(nomes);
		
		for (String obj : nomes) {
			System.out.println(obj);
		}
	
		System.out.println(nomes.size());
		
	}	
}
