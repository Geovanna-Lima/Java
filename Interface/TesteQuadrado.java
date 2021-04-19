package Class8;

import java.util.Scanner;

public class TesteQuadrado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira os valores da base e da altura do quadrado:");
		
		Quadrado q1 = new Quadrado(sc.nextDouble(), sc.nextDouble());
		
		System.out.println("Os valores inseridos são:" +q1.apresentar());
		System.out.println("O valor da área é:" +q1.area());

	}

}
