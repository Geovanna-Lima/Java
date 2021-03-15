package ListaEncadeada;

import java.util.LinkedList;

public class Exercicio4 {

	public static void main(String[] args) {
		
		LinkedList<Integer> lista = new LinkedList<Integer>();
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);

		Integer maior = 0;
		System.out.println("O maior valor da lista é:");
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i) > maior) {
				maior = lista.get(i);
			}
			
		}
		
		System.out.println(maior);
	}
	
}
