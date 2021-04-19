package Class5;

import java.util.Scanner;

public class TesteJava {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com três números inteiros para acharmos o maior:");
		
		System.out.println(Java.max3(sc.nextInt(), sc.nextInt(), sc.nextInt()));
		
		System.out.println("Entre com três números decimais para acharmos o maior:");
		
		System.out.println(Java.max3(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));

	}

}
