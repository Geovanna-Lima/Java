package Array;

public class Exercicio4 {

	public static void main(String[] args) {

    	int array1[][];
    	
    	array1 = new int[50][100]; 

    	int i; 
        int j;

        System.out.println("A soma dos índices em ordem inversa:");
		for (i = 50-1; i >= 0; i--) {
            for (j = 100-1; j >= 0; j--){
            	array1[i][j]=i+j;
  			   System.out.println(array1[i][j]);
	        }   
            
        }
		
    }
	
}
