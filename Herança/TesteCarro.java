package Class7;

import java.util.Scanner;

public class TesteCarro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Carro
		System.out.println("Escreva as informa��es sobre seu carro (modelo, marca e quantidade de portas):");
		
		Carro c1 = new Carro(sc.nextLine(), sc.nextLine(), sc.nextInt());
		
		System.out.println("As informa��es inseridas s�o:");
		
		System.out.println(c1.toString());
		

	}

}
