package com.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MetodosLocalDate {
	public static void main(String[] args) {
		System.out.println("###---LocalDate--###");
		LocalDate ld = LocalDate.of(2020, 1, 30);
		System.out.println("1. " + ld);

		ld.plusDays(5); /// LocalDate es inmutable, la funcion plusday devuelve otro LocalDate
		System.out.println("2. " + ld);

		LocalDate ld2 = ld.plusDays(5);
		System.out.println("3. " + ld2);

		ld = ld.plusDays(10);
		System.out.println("4. " + ld);

		System.out.println("###---LocalDatetime--###");
		// LocalDatetime tambien es inmutable

		LocalDateTime ldt = LocalDateTime.of(2020, 2, 12, 20, 30);
		System.out.println("5. " + ldt);

		ldt.plusDays(5);
		System.out.println("6. " + ldt);

		ldt = ldt.plusDays(5);
		System.out.println("7. " + ldt);

		// GET
		System.out.println("###---LocalDatetime GET--###");
		LocalDateTime ldt2 = LocalDateTime.of(2020, 3, 7, 12, 15);

		System.out.println("8. " + ldt2.getYear());
		System.out.println("9. " + ldt2.getMonth());
		System.out.println("10. " + ldt2.getDayOfMonth());
		System.out.println("10.1. " + ldt2.getDayOfWeek());
		System.out.println("10.2. " + ldt2.getDayOfYear());
		System.out.println("11. " + ldt2.getHour());
		System.out.println("12. " + ldt2.getMinute());

		
		
		
	}
}
