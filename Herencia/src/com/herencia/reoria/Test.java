package com.herencia.reoria;

public class Test {

	public static void main(String[] args) {
		Gato gato = new Gato(); 
		gato.maullar();  //de Gato
		gato.dormir(); 	//de Animal
		gato.toString();  	//de Object
		
		System.out.println("-----------------------");
		Animal animal = new Gato(); 
		//animal.maullar();  //tipo de dato es animal
		animal.comer(); 	//de Animal
		animal.toString();  	//de Object
		System.out.println("-----------------------");
		
		//Gato gato2=new Animal(); // no cumple padre =hijo
		
		Gato gato3 = new Gato();
		Animal a2 = (Animal) gato3;
		
		
		
		 
	}
	
	

}
