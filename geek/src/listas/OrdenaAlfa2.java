package listas;

import java.util.Arrays;

public class OrdenaAlfa2 {

	public static void main(String[] args) {

		 // storing input in variable
        String names[] = { "Raul", "Paulo", "Gionvani", "Rita", "Amanda"
        		, "Andrea", "Zara" };
        int n = names.length;
        Arrays.sort(names);
        System.out.println("Os nomes em ordem alfabéticas são: \\n");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
	}

}
