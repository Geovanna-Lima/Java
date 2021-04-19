package Class6;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o nome e prontuário do aluno");
		
		Aluno a1 = new Aluno(sc.nextLine(), sc.nextLine());
		
		System.out.println("Os dados inseridos são:");
		System.out.println(a1.toString());
	}

}
