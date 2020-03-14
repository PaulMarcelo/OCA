package com.sobreescritura;

import java.util.ArrayList;
import java.util.List;

public class Interface {
	public static void main(String[] args) {
		// List<String> list = new List<>(); erro de ompialcion no puede instanciar una
		// interface
		/*
		 * Esto compila por que esta emn relacion de herencia debido a que ArrayList
		 * implementa la inteface list
		 */
		List<String> list2 = new ArrayList<String>();
	}
}
