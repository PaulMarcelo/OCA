package com.conversion;

import java.util.Arrays;
import java.util.List;

import com.herencia.Animal;

public class Conversion {

	public static void main(String[] args) {
		Animal animales[] = new Animal[2];
		List<Animal> list = Arrays.asList(animales);

		 
		System.out.println(list);
//		list.add(new Animal()); error de ejcucion lista atada arreglo no puedoi modificar el tamaño
		List<Animal> lista2 = Arrays.asList(new Animal(), new Animal(), new Animal());

		
		
		
	}

}
