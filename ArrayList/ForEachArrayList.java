package Class9;

import java.util.ArrayList;

public class ForEachArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> linguagens = new ArrayList<>();
	
		linguagens.add("Java");
		linguagens.add("Python");
		linguagens.add("C++");
		
		for(String l: linguagens)
			System.out.println(l);
	}
}
