import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com seu ano de nascimento");
		
		Integer Nas = sc.nextInt();
				
		Integer idade = 2020- Nas;
				
		System.out.println("Sua idade é:" + idade);

	}

}
