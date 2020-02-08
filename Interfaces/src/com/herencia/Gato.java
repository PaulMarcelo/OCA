package com.herencia;

public class Gato extends Animal {
	public void maullar() {
		System.out.println("Gato Maullando");
	}

	@Override
	public void comer() {
		// al sobreescribir el método ejecuta siempre este método
		//Si se sobre escribe el método no se puede hacer más restictivo
		// public
		// protected
		// default
		// private	
		System.out.println("Gato Comiendo");
	}

}
