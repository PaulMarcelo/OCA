package com.predicados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Buscador {

	public static void main(String[] args) {

		List<Persona> personas = Arrays.asList(new Persona(12, "Luis"), new Persona(20, "Carlos"),
				new Persona(2, "Pedro"), new Persona(30, "Jose"));

		System.out.println(buscar(personas, new MayorEdad()));

		// clase anonima clases definidas internas

		List<Persona> menoresDeEdad = buscar(personas, new Predicate<Persona>() {
			@Override
			public boolean test(Persona p) {
				return p.getEdad() > 18;
			}
		});

		System.out.println(menoresDeEdad);

		// Lambda
		menoresDeEdad = buscar(personas, (Persona p) -> {
			return p.getEdad() < 18;
		});

	}

	private static List<Persona> buscar(List<Persona> personas, Predicate<Persona> predicate) {
		List<Persona> listaReturn = new ArrayList<Persona>();
		for (Persona persona : personas) {
			if (predicate.test(persona)) {
				listaReturn.add(persona);
			}
		}
		return listaReturn;
	}

}
