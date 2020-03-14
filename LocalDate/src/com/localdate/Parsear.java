package com.localdate;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parsear {
	public static void main(String[] args) {
		LocalDate ld = LocalDate.parse("2020-03-07");
		System.out.println(ld);

//		LocalDate ld2 = LocalDate.parse("Hola mundo"); // Error de ejecucion DateTimeParseException

		LocalDate ld3 = LocalDate.parse("2020-03-07", DateTimeFormatter.ISO_DATE);
		System.out.println(ld3);

//		LocalDate ld4 = LocalDate.parse("2020-03-07", DateTimeFormatter.ISO_DATE_TIME);

		DateTimeFormatter datetimeformate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ld5 = LocalDate.parse("07/03/2020", datetimeformate);
		System.out.println(ld5);
	}
	
		
}
