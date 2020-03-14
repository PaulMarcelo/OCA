package com.predicados;

import java.util.function.Predicate;

public class MayorEdad implements Predicate<Persona> {

	@Override
	public boolean test(Persona p) {
		return p.getEdad() > 18;
	}

}
