import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Scanner sc2 = new Scanner(System.in);

		Scanner sc3 = new Scanner(System.in);

		Scanner sc4 = new Scanner(System.in);
		
		System.out.println("Entre com a nota do primeiro bimestre");
		
		double a = sc.nextDouble();
		
		System.out.println("Entre com a nota do segundo bimestre");
		
		double b = sc.nextDouble();
		
		System.out.println("Entre com a nota do terceiro bimestre");
		
		double c = sc.nextDouble();
		
		System.out.println("Entre com a nota do quarto bimestre");
		
		double d = sc.nextDouble();
		
		double med = (a + b + c + d) /4;
		
		if ( med >= 6.0) 
			
			System.out.println("Aprovado!");
		
		else 
			
			if( med >= 4.0 && med < 6.0 )
				
				System.out.println("Recuperação!");
			
			else

				System.out.println("Reprovado!");

	}

}
