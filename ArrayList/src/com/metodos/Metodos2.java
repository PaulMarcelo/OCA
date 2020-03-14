package com.metodos;

import java.util.ArrayList;

public class Metodos2 {
	public static void main(String[] args) {
		// Definicion
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(1);
		aList.add(2);
		aList.add(3);
		aList.add(4);
		aList.add(2);
		System.out.println(aList);
		/*Cuando el array es de enteros el remove elimina la posicion*/
		aList.remove(2); //elimina el indice 2
		System.out.println(aList);
		
		aList.remove(new Integer(2));
		System.out.println(aList); // elimina el objeto2, comparando con el equals
		
		aList.remove(new Integer(2));
		System.out.println(aList); // el
		
		
		
		
		 
		

	}
}
