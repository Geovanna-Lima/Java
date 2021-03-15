package Array;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int array1[]; 
		
		array1 = new int[10]; 
	
		int i;
		
		int x;
	
		//Valor do índice do elemento
		System.out.println("Os valores em ordem inversa são:" );
		for (i = 0;i < array1.length; i++) {
			array1[i] = i; 
		}
		//Colocando em ordem inversa
		for(x = i-1; x >= 0;  x--) {
			
			System.out.println(array1[x]);
		}
	}
}
