package com.equals;

import com.commons.Persona;

public class Equals {

	public static void main(String[] args) {
		int a1[] = { 2, 3 };
		int a2[] = { 2, 3 };
		System.out.println(a1 == a2); // false porque verifica que apunta al mismo objeto
		System.out.println(a1.equals(a2)); // false porque verifica que apunta al mismo objeto

		// String
		String a = "abc";
		String b = "a";
		String c = b + "bc";
		System.out.println(a == c); // false porque verifica que apunta al mismo objeto
		System.out.println(a.equals(c)); // false porque verifica que apunta al mismo objeto
		// Integer
		Integer i1 = 200;
		Integer i2 = 200;
		System.out.println(i1 == i2); // false porque verifica que apunta al mismo objeto
		System.out.println(i1.equals(i2)); // true porque verifica que apunta al mismo objeto
		// Persona
		Persona p1 = new Persona("Paul", "Yaguachi");
		Persona p2 = new Persona("Paul", "Yaguachi");

		System.out.println("------------->Persona");
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));

	}
}
