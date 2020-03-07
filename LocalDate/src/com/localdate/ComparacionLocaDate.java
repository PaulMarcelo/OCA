package com.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ComparacionLocaDate {
	public static void main(String[] args) {
		// conversion localdate -> localdatetime
		System.out.println("###---Comparacion--###");
		LocalDate ld = LocalDate.now();
		System.out.println("ld " + ld);
		LocalDate ld2 = LocalDate.now();
		System.out.println("ld2 " + ld2);

		LocalDate ld1 = ld.minusDays(3);
		System.out.println("ld1 " + ld1);

		// LocalDate se encuentra sobreescrityo el metodo equals compara contenido

		System.out.println("== " + (ld == ld2));
		System.out.println("equals " + ld.equals(ld2));
		System.out.println("isEqual " + ld.isEqual(ld2));

		System.out.println("isAfter " + ld.isAfter(ld1));

		System.out.println("isBefore " + ld.isBefore(ld1));

	}
}
