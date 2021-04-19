package Class10;

import java.time.Month;
import java.time.LocalDate;
import java.time.DayOfWeek;

public class LocalDate5 {

	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		
		int ano = hoje.getYear();
		Month mes = hoje.getMonth();
		int diaDoMes = hoje.getDayOfMonth();
		int diaDoAno = hoje.getDayOfYear();
		DayOfWeek diaDaSemana = hoje.getDayOfWeek();
		
		System.out.println("Hoje: " +hoje);
		System.out.println("Ano: " +ano);
		System.out.println("M�s: " +mes);
		System.out.println("Dia do M�s: " +diaDoMes);
		System.out.println("Dia do Ano: " +diaDoAno);
		System.out.println("Dia da Semana: " +diaDaSemana);

	}

}
