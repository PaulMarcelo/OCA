package com.herencia;

import java.util.ArrayList;
import java.util.List;

public class Herencia {
	public static void main(String[] args) {
		List<Animal> animales = new ArrayList<Animal>();
		animales.add(new Animal());
		animales.add(new Perro()); // Se puede agregar el mismo tipo o algun hijo o clase que tenga relacion
		// de herencia

		animales.add(new Gato());

		List<Gato> gatos = new ArrayList<Gato>();
//		gatos.add(new Animal());//error de compilacion  se puede agregar mismo tipo o hijos
		gatos.add(new Gato());

		List<Domesticable> domesticable = new ArrayList<Domesticable>();
//		domesticable.add(new Domesticable()); error de compilacion no se puede instanciar uina interface
		domesticable.add(new Gato());
		

	}
}
