package Class6;

import java.util.Scanner;

public class TesteLivro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o T�tulo, ISBN e Tema do livro:");
		
		Livro l1 = new Livro (sc.nextLine(), sc.nextLine(), sc.nextLine());
		
		System.out.println("Os dados inseridos s�o:");
		
		System.out.println(l1.toString());
		
	}

}
