import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro n�mero:");
		
		double a = sc.nextDouble();
		
		System.out.println("Entre com o segundo n�mero:");
		
		double b = sc2.nextDouble();
		
		double soma = a + b;
		
		System.out.println("A soma desses n�meros �:" + soma);
		
		double sub = a - b;
		
		System.out.println("A subtra��o desses n�meros �:" + sub);

		double mult = a * b;
		
		System.out.println("A multiplica��o desses n�meros �:" + mult);

	}

}
