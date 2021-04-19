import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Entre com um Número inteiro:");
		
		Integer a = sc.nextInt();
		
		System.out.println("Entre com um Número inteiro:");

		Integer b = sc2.nextInt();

		if(a>b)
			
			System.out.println(+b +" é menor que " +a);
		
		else 
			
			if (a==b) 
				
				System.out.println("Os números são iguais" );
		
			else
				
				System.out.println(+a +" é menor que " +b);

	}

}
