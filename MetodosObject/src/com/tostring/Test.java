package com.tostring;

import com.commons.Persona;

public class Test {
	public static void main(String[] args) {
		Persona p1 = new Persona("Paul", "Yaguachi");
		Persona p2 = new Persona("Paul", "Yaguachi");
		// imprime la misma ubicacion en memoria los dos objetos, por que esta sobre
		// escrito el metodo
		// hascode
		System.out.println(p1.toString());
		System.out.println(p2.toString());

		int arreglos1[] = { 2, 3, 4, 5 };
		System.out.println(arreglos1.toString());
		int arreglos2[][] = new int [4][1];
		System.out.println(arreglos2.toString());
		
		Persona arreglos3[] = new Persona [3];
		System.out.println(arreglos3.toString());
	}
}
