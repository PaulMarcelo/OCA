package com.excepciones.teoria;

import java.io.File;

public class Ejercicio1 {

	public static void main(String[] args) {
		int[] numeros = new int[2];
		//numeros[2] = 5; // ArrayIndexBoundsOfExcepticon

		String nombre = null;
		nombre.trim(); // NUllPointerException
		
		File f = new File("ej1.txt");
		f.createNewFile();
	}

}
