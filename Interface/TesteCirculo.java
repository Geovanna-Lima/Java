package Class8;

import java.util.Scanner;

public class TesteCirculo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor do raio do circulo:");
		
		Circulo c1 = new Circulo(sc.nextDouble());
		
		System.out.println("O valor inserido foi:" +c1.apresentar());
		System.out.println("O valor da área do circulo é:" +c1.area());

	}

}
