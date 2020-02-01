package com.arreglos2;

public class ArreglosDosDimensiones {
	public static void main(String[] args) {

		int arreglo4[][] = { { 3, 1 }, { 8 }, { 5, 4 } };
		int[][] arreglo3 = new int[2][];
		int[] arreglo2[] = new int[1][4];

		// El tamaño de un arreglo dos dimensiones es el tamaño del arreglo principal
		System.out.println("Tamaño arreglo4:" + arreglo4.length);
		System.out.println("Tamaño arreglo3:" + arreglo3.length);
		System.out.println("Tamaño arreglo2:" + arreglo2.length);
		System.out.println("" + arreglo4[2][1]);

		// System.out.println("" + arreglo4[1][1]);// genera un error de ejecucion
		// (ArrayIndexOutOfBoundsException)

		// Iteracion de arreglos bidimencionales

		for (int i = 0; i < arreglo4.length; i++) {
			for (int j = 0; j < arreglo4[i].length; j++) {
				System.out.println("arreglo4[" + i + "][" + j + "]:" + arreglo4[i][j]);
			}
		}

		// foreach

		for (int[] is : arreglo4) {
//			for (int is1 : is) {
//				System.out.println("arreglo4: " + is1);
//			}
			
			for (int j = 0; j < is.length; j++) {
				System.out.println("arreglo4: " + is[j]);
			}
		}

	}
}
