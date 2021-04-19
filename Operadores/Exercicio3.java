
public class Exercicio3 {

	public static void main(String[] args) {

		Integer x = new Integer(3);
				
		while (x <= 100) {
			
			if(x % 3 == 0) {
				
				System.out.println("Os multiplos são:" + x);

				x = x + 1;	
			
			}
			else
				
				x = x + 1;	
		}

	}
	
}
