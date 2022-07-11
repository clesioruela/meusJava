package avancados;

import java.util.function.Consumer;

public class ForEachImpNaLinha implements Consumer<String>{

	@Override
	public void accept(String st) {
		System.out.println(st);
	}

}
