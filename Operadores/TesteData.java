package Class5;

import java.util.Scanner;

public class TesteData {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o dia, mes e ano:");
			
		Data dt1 = new Data(sc.nextInt(),sc.nextInt(),sc.nextInt());
			
		System.out.println("Coloque o n�mero do m�s desejado:");
		
		System.out.println("A quantidade de dias passados at� esse m�s s�o:\n" +dt1.QntDias(sc.nextInt()));
		
		System.out.println("Coloque o nome do m�s desejado:");
		
		sc.nextLine();
	
		System.out.println("A quantidade de dias passados at� esse m�s s�o:\n" +dt1.StringQntDias(sc.nextLine()));

		System.out.println("O formato padr�o �:\n" + dt1.Imprime());
	}

}
