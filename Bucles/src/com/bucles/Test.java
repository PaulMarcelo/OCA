package com.bucles;

public class Test {
	public static void main(String[] args) {

		int arreglo[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// CONTINUE Y BREAK
		for (int val : arreglo) {
			if (val % 3 == 0) {
				continue;
			}
			System.out.println(val + " ");
		}

		for (int val : arreglo) {
			if (val % 3 == 0) {
				break;
			}
			System.out.println(val + " ");
		}

		// WHILE Y DO-WHILE
		System.out.println("----------------WHILE-------------------------");
		int x = 2;
		while (x < 2) {
			System.out.println(x);
			x++;
		}
		System.out.println("----------------DO WHILE-------------------------");

		do {
			System.out.println(x);
			x++;
		} while (x < 2);

	}
}
