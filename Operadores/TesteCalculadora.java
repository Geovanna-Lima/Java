package Class5;

import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Somar Inteiro
		System.out.println("Entre com dois n�meros inteiros para ser efetuado a soma:");
		
		System.out.println(Calculadora.somar(sc.nextInt(),sc.nextInt()));
		
		//Somar Decimal
		System.out.println("Entre com dois n�meros decimais para ser efetuado a soma:");
		
		System.out.println(Calculadora.somar(sc.nextDouble(),sc.nextDouble()));

		//Quadrado Inteiro
		System.out.println("Entre com um n�mero inteiro para ser efetuado o quadrado:");
		
		System.out.println(Calculadora.quadrado(sc.nextInt()));
		
		//PI 
		System.out.println("O valor de PI �:");
		
		System.out.println(Calculadora.pi());
		
	}

}
