package com.excepciones.teoria;

import java.io.File;

public class UnreacheableCode {
	public static void main(String[] args) {
		try {

			
			int[] numeros = new int[2];
			numeros[2] = 5;
			String nombre = null;
			nombre.trim();
			throw new AnotherException();
			
		} 
		// El orden en la estructura de las excepciones es importante (Unreacheable Code)
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException: " + e);
		} catch (NullPointerException e) {
			System.out.println("NullPointerException: " + e);
		} catch (Exception e) {
			System.out.println("No era ningun otro tipo de ex.: " + e);
		}
	}
}
