package Class12;

import java.util.Scanner;

public class TesteComissionado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o nome, sal�rio base e comiss�o do comissionado:");
		
		Comissionado c1 = new Comissionado(sc.nextLine(), sc.nextDouble(), sc.nextInt());
		
		System.out.println("Os dados inseridos foram: " +c1.toString());
		
		System.out.println("O sal�rio do comissionado �: " +c1.calcularSalario());

	}

}
