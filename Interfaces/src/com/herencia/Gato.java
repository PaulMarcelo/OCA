package com.herencia;

public class Gato extends Animal {
	public void maullar() {
		System.out.println("Gato Maullando");
	}

	@Override
	public void comer() {
		// al sobreescribir el m�todo ejecuta siempre este m�todo
		//Si se sobre escribe el m�todo no se puede hacer m�s restictivo
		// public
		// protected
		// default
		// private	
		System.out.println("Gato Comiendo");
	}

}
