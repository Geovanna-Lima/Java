package Class11;

public class TryCatch3 {

	public static void main(String[] args) {
		
		try {
			int data = 50/0;
		}
		catch(Exception e) {
			
			System.out.println("N�o � poss�vel dividir um n�mero por zero!");;
		}
		
	}
}
