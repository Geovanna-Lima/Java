import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Entre com um N�mero inteiro:");
		
		Integer a = sc.nextInt();
		
		System.out.println("Entre com um N�mero inteiro:");

		Integer b = sc2.nextInt();

		if(a>b)
			
			System.out.println(+b +" � menor que " +a);
		
		else 
			
			if (a==b) 
				
				System.out.println("Os n�meros s�o iguais" );
		
			else
				
				System.out.println(+a +" � menor que " +b);

	}

}
