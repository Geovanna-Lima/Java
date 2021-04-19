import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		System.out.println("Entre com um numero para ser efetuada a soma");
		
		Scanner sc = new Scanner(System.in);
		
		Integer x = sc.nextInt();
		
		Integer soma = new Integer(0);
		
		while (x > 0) {
			
			soma = soma + x;
			
			System.out.println("Entre com um número para ser efetuada a soma:");
			
			x = sc.nextInt();
		}
		
		System.out.println("Soma:"+soma);
	}

}
