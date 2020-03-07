package com.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ConvertirLocalDate {
	public static void main(String[] args) {
		// conversion localdate -> localdatetime
		System.out.println("###---Conversion localdate -> localdatetime--###");
		LocalDate ld = LocalDate.of(2020, 3, 7);
		System.out.println("Solo Fecha " + ld);
		LocalDateTime ldt = ld.atTime(10, 20);
		System.out.println("Agregar hora " + ldt);

		LocalDateTime ldt2 = ld.atStartOfDay();
		System.out.println("atStartOfDay " + ldt2);

		// conversion localdatetime -> localdate
		System.out.println("###---Conversion localdatetime -> localdate--###");

		LocalDate ld2 = ldt.toLocalDate();
		System.out.println("toLocalDate " + ld2);

	}
}
