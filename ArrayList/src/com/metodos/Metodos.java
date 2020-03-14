package com.metodos;

import java.util.ArrayList;

public class Metodos {
	public static void main(String[] args) {
		// Definicion
		ArrayList<String> aList = new ArrayList<String>();
		ArrayList<String> aList2 = new ArrayList<>();
//		aList.add(1);

		ArrayList aList3 = new ArrayList<>(); // no pongo el tipo, por defecto toma el tipo Object
		aList3.add("String");
		aList3.add(1);

		// ADD
		// Puedo añadir elementos del tipo definido
		// aList.add(1); error de compilacion por que recibe string pero estoy mandando
		// int

		aList.add("uno");
		aList.add("dos");
		aList.add(null);
		aList.add("tres");
		System.out.println(aList);
		
		aList.add(0,"cero");
		System.out.println(aList);
		//aList.add(6,"cuatro");//error de ejecucion indexOutBoundsException por que el tamaño es 5
		
		aList.add(5,"cuatro");
		System.out.println(aList);
		
		
		
		//REMOVE
		System.out.println("---------------> REMOVE");
		aList.remove(0);  //elimina por posicion
		System.out.println(aList);
		
		/*
		 * Si se pasa un objecto se recorre la lista uy cpompara con el equals 
		 * si no existe el objecto en la lista no pasa nada el remove retiorna un boolena para saber si elimino o no
		 */
		
		
		boolean delete = aList.remove("dos");//elimina por contenido
		System.out.println(aList);
		System.out.println(delete);
		delete = aList.remove("diez");
		System.out.println(delete);
		

	}
}
