package Class10;

import java.time.LocalDate;

public class LocalDate4 {

	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		LocalDate ontem = hoje.minusDays(1);
		LocalDate amanha = ontem.plusDays(2);
		
		System.out.println("Hoje: " +hoje);
		System.out.println("Ontem: " +ontem);
		System.out.println("Amanhã: " +amanha);

	}

}
