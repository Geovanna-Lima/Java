package Class9;

import java.util.ArrayList;

public class ArrayList4 {

	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<>();
		
		lista.add("Programador");
		lista.add("Programador");
		lista.add(1,"Analista de Sistemas");
		
		for( int i = 0; i < lista.size(); i++) {
			System.out.print(lista.get(i) + " ");
		}
		
		System.out.println();
		
		for(String l: lista)
			System.out.print(l +" ");

	}

}
