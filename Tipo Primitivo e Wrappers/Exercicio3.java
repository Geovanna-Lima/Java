import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número:");
		
		double a = sc.nextDouble();
		
		System.out.println("Entre com o segundo número:");
		
		double b = sc2.nextDouble();
		
		double soma = a + b;
		
		System.out.println("A soma desses números é:" + soma);
		
		double sub = a - b;
		
		System.out.println("A subtração desses números é:" + sub);

		double mult = a * b;
		
		System.out.println("A multiplicação desses números é:" + mult);

	}

}
