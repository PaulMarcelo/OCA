package com.teoria;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Test {
	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalDate ld1 = LocalDate.of(1993,12,19);
		System.out.println(ld1);
		
		LocalDate ld2 = LocalDate.of(2020, Month.FEBRUARY, 1);
		System.out.println(ld2);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		//Necesita definir y-m-d y horas y minutos
		LocalDateTime ldt1 = LocalDateTime.of(1993, 12,19,10,40,20);
		System.out.println(ldt1);

	}
}
  