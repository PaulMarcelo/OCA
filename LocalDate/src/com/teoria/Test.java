package com.teoria;

import java.time.LocalDate;
import java.time.Month;

public class Test {
	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		LocalDate ld1 = LocalDate.of(2020, Month.FEBRUARY, 1);
		System.out.println(ld1);

	}
}
  