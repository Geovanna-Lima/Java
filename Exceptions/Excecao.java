package Exceptions;

public class Excecao {

	public static void main(String[] args) {
		
		try {
			int[] vetor = new int [4];
			
			System.out.println("Antes da Exception");
			
			vetor[4] = 1;

			System.out.println("Esse texto n�o ser� impresso");
		}
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exe��o ao acessas um �ndice do vetor que n�o existe");
		}
		System.out.println("Esse texto ser� impresso ap�s a exception");
	}

}
