
public class Exercicio2 {

	public static void main(String[] args) {

		Integer x = new Integer (0);
		
		Integer soma = new Integer (0);
		
		while (x <= 1000) {
			
		System.out.println("A soma dos valores é:" + soma);

		x = x + 1;
		
		soma = x + soma;
		
		}
		
	}

}
