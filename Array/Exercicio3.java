package Array;

public class Exercicio3 {

	public static void main(String[] args) {

    	int array1[][];
    	
    	array1 = new int[100][100]; 

    	int i; 
        int j; 

        //Subtra��o dos �ndices
        System.out.println("Os valores do Array s�o:");
		for (i = 0; i < 100; i++) {
            for (j = 0; j < 100; j++){
  			   array1[i][j] = i-j; 
  			   System.out.println(array1[i][j]);
	        }   
        }
		//Multiplica��o dos elementos
		System.out.println("A multiplica��o �:");
		for (i = 0; i < 100; i++) {
            for (j = 0; j < 100; j++){
  			   array1[i][j] = (i-j)*7; 
  			   System.out.println(array1[i][j]);
	        }   
        }
    }
}
