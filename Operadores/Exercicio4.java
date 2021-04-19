import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Integer x = new Integer(0);
		
		Scanner sc = new Scanner (System.in);

		System.out.println("Entre com um número de 1 até 100:");
		
		x = sc.nextInt();
		
		do {
			
			if((x <= 100) && (x >= 1)) {
				
				Integer a = new Integer(1);
				
				while (a <= x) {
				
					System.out.println("*");
				
					a = a + 1;
				
				}
			
			}
		
				System.out.println("Entre com um numero de 1 até 100:");
			
				x = sc.nextInt();
		}
		
				while (x !=0);
	}

}
	

