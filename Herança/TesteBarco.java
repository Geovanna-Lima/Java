package Class7;

import java.util.Scanner;

public class TesteBarco {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Barco
		System.out.println("Escreva as informações sobre seu barco (modelo, marca e potencia do motor):");
		
		Barco b1 = new Barco(sc.nextLine(), sc.nextLine(), sc.nextInt());
		
		System.out.println("As informações inseridas são:");
		
		System.out.println(b1.toString());
	}
}
