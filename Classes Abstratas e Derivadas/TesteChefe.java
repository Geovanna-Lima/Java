package Class12;

import java.util.Scanner;

public class TesteChefe {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o nome e salário do chefe:");
		
		Chefe c1 = new Chefe(sc.nextLine(), sc.nextDouble());
		
		System.out.println("Os dados inseridos foram: " +c1.toString());
		
		System.out.println("O salário do chefe é: " +c1.calcularSalario());

	}

}
