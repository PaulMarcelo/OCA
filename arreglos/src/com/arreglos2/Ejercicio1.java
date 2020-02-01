package com.arreglos2;

public class Ejercicio1 {
	public static void main(String[] args) {
		int valores[][] = new int[3][]; // valores por defecto son null
		int numbers[][] = new int[2][1];
		int a[] = { 4, 5, 6 };

		valores[1] = a;
		valores[2] = numbers[0];
		valores[2][1] = 6; // genera un Array index bound of exception.

	}

}
