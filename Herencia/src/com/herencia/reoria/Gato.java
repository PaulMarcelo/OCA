package com.herencia.reoria;

public class Gato extends Animal {
	
	public void maullar() {
		System.out.println("Gato Maullando");
	}

	@Override
	public void comer() {	
		System.out.println("Gato Comiendo");
	}

}
