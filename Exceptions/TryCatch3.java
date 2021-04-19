package Class11;

public class TryCatch3 {

	public static void main(String[] args) {
		
		try {
			int data = 50/0;
		}
		catch(Exception e) {
			
			System.out.println("Não é possível dividir um número por zero!");;
		}
		
	}
}
