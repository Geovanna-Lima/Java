package Array;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		int array1[]; 
		
		array1 = new int[9]; 
	
		int i;
	
		//Valor do �ndice do elemento
		System.out.println("Os valores s�o:" );
		for (i = 0; i < array1.length; i++) {
			array1[i] = i; 
			System.out.println(array1[i]);
		}
		//Multiplicando
		System.out.println("Os valores multiplicados s�o:");
		for (i = 0; i < array1.length; i++) {
			array1[i] = i*3; 
			System.out.println(array1[i]);
		}
		
	}
	
}

