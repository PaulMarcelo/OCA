package com.arreglos2;

public class Ejercicio2 {
	public static void main(String[] args) {
		int a[][] = { { 3 }, { 3, 4 }, { 3, 4, 5 } };
		int b[] = { 9, 8 };
		a[0][0] = b[1];
		a[0] = b;
		int c[] = a[1];
		c[0] = b[0];
		System.out.println(a[0][0]);
		System.out.println(c[0]);
	}
}
