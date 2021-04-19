package Class7;

import java.util.Scanner;

public class TesteMoto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Moto
		System.out.println("Escreva as informações sobre sua moto (modelo, marca e quantidade de cilindradas):");
		
		Moto m1 = new Moto(sc.nextLine(), sc.nextLine(), sc.nextInt());
		
		System.out.println("As informações inseridas são:");
		
		System.out.println(m1.toString());
		
	}
}
