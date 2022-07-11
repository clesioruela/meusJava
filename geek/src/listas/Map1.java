package listas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map1 {

	public static void main(String[] args) {

		Map<Integer, String> pessoas = new HashMap<>();

		pessoas.put(1, "Marcelo");
		pessoas.put(4, "Gustavo");
		pessoas.put(2, "Amanda");
		pessoas.put(5, "Zelia");
		pessoas.put(3, "Abarte");

		pessoas.keySet().forEach(ind -> {
			System.out.println(pessoas.get(ind));
		});

		// System.out.println(pessoas.keySet());
		// System.out.println();
		// System.out.println(pessoas.values());
		// System.out.println(pessoas.entrySet());

		System.out.println();
		Set<Integer> valor = pessoas.keySet();
		for (Integer nmvalor : valor) {
			System.out.println(pessoas.get(nmvalor));
		}

		System.out.println();
		Collection<String> vls = pessoas.values();
		for (String nome : vls) {
			System.err.println(nome);
		}

		System.out.println();
		pessoas.values().forEach(nm -> {
			System.out.println(nm);
		});
	
		System.out.println();
		Set<Entry<Integer, String>> valorNome = pessoas.entrySet();
		for (Entry<Integer, String> entryx : valorNome) {
			System.out.println(entryx.getKey() + " - " + entryx.getValue());
		}
		
		System.out.println();
		pessoas.entrySet().forEach(e -> {
			System.out.println(e.getKey() + " = " + e.getValue());
		});
	}
}
