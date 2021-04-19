package Class10;

import java.time.LocalDate;

public class LocalDate6 {

	public static void main(String[] args) {
		
		LocalDate data1 = LocalDate.of(2020, 3, 3);
		System.out.println(data1.isLeapYear());
		
		LocalDate data2 = LocalDate.of(2021, 6, 4);
		System.out.println(data2.isLeapYear());

	}

}
