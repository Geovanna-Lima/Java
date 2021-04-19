package Class9;

import java.util.ArrayList;

public class ArrayList5 {

	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<>();
		
		lista.add("Programador Java");
		lista.add("Programador C++");
		lista.add(1,"Geeks");
		
		System.out.println("ArrayList inicial: " +lista);
		
		lista.set(1,  "Analista de Sistemas");
		
		System.out.println("ArrayList atualizado: " +lista);

	}

}
