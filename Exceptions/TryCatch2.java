package Class11;

public class TryCatch2 {

	public static void main(String[] args) {
		
		String frase = null;
		String novaFrase = null;
		
		try {
			novaFrase = frase.toUpperCase();
		}
		catch(NullPointerException e) {
			
			System.out.println("A frase inicial tem o valor null");
			
			frase = "Frase de Teste";
		}
		finally {
			novaFrase = frase.toUpperCase();
		}
		
		System.out.println("Frase antiga: " +frase);
		
		System.out.println("Frase Nova: " +novaFrase);
		
	}

}
