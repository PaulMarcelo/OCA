package com.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Formato {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.of(2020, 02, 14);
		System.out.println(ld);

		// ISO_DATE: me retorna la misma fecha

		String cadena = ld.format(DateTimeFormatter.ISO_DATE); // ISO_DATE -> yyyy-mm-dd, toString pordefecto usa ISO
																// DATE
		System.out.println("ISO_DATE " + cadena);

//		 Errrr de ejecucion
//		 ISO_DATE_TIME si se quiere dar formato a un localdate da un error de
//		 ejecucion por que no tiene horas , minutos, segundos
//		String cadena2 = ld.format(DateTimeFormatter.ISO_DATE_TIME);
//		System.out.println("ISO_DATE_TIME " + cadena2);

		LocalDateTime ldt = LocalDateTime.of(2020, 02, 14, 10, 20);
		System.out.println("LDT " + ldt);
		String cadena2 = ldt.format(DateTimeFormatter.ISO_DATE);
		System.out.println("LDT >>> ISO_DATE" + cadena2);
		String cadena4 = ldt.format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println("LDT >>> ISO_DATE_TIME " + cadena4);

		DateTimeFormatter datetimeformate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String cadena5 = ld.format(datetimeformate);

		System.out.println("cadena5 " + cadena5);
	}

}
