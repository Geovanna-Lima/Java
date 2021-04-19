package Class12;

import java.util.Scanner;

public class TesteComissionado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o nome, salário base e comissão do comissionado:");
		
		Comissionado c1 = new Comissionado(sc.nextLine(), sc.nextDouble(), sc.nextInt());
		
		System.out.println("Os dados inseridos foram: " +c1.toString());
		
		System.out.println("O salário do comissionado é: " +c1.calcularSalario());

	}

}
