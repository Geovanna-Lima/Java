package Class9;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		java.util.ArrayList<Integer> lista = new ArrayList<Integer>();
		
		for (int i =1; i <= 5; i++)
			lista.add(i);
		
		System.out.println(lista);
		
		lista.remove(3);
		
		System.out.println(lista);
		
		for( int i = 0; i < lista.size(); i++) {
			System.out.print(lista.get(i) + " ");
		}
	}

}
