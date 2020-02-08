package com.herencia.reoria;

public class Test {

	public static void main(String[] args) {
		Gato gato = new Gato();
		gato.comer(); //de animal
		gato.maullar(); //de gato
		//gato.dormir(); //método no visible para la clase hija, es un método privado
		gato.toString(); //de object
		
		Animal animal = new Animal();
		//animal.dormir(); //no se puede usar es un método privado
		
	}
	
	

}
