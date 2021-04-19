package Class11;

public class TryCatch4 {

	public static void main(String[] args) {
		
		try {
			int array[] = {1,3,5,7};
			System.out.println(array[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Posição inexistente!");;
		}

	}

}
