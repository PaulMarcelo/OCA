package arreglos.teoria;

import java.util.Iterator;

///Errores de compilacion, cuando no se declara bien el arreglo
// nunca definir tamaño en la declaraciòn
// dos formas de instanciar
public class arreglos {

	public static void main(String[] args) {
		// int arr1[] = new int[];// error de compilacion, falta definicion de tamaño

		int arr2[] = new int[2]; // Definicion e instanciaciòn
		int[] arr3 = new int[2];

		int arreglo[] = { 3, 6, 9 };
		// for clasico
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println("" + arreglo[i]);
		}

		// #### Ejercicios arreglo

		int a1[] = { 3, 4, 5 };
		int[] a2 = { 7, 8 };
		int[] a3 = a1;

		a3[2] = a2[0];
		a2[0] = a1[1];
		a1 = a3;
		System.out.println(a1[0] + " : " + a1[1]);

		// formas de recorrer un arreglo
		// for clasico y foreach

		// foreach
		// para manejar indices con foreach se necesita declarar una variable contador
		// que maneje el indice
		for (int i : arreglo) {
			System.out.println(" " + i);
		}

	}

}
