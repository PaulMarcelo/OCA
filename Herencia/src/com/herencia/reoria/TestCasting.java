package com.herencia.reoria;

public class TestCasting {

	public static void main(String[] args) {
			Gato gato = new Gato();
			Animal anima= (Animal)gato; //Compilacion relación de herencia
			gato.maullar();
//			anima.maullar()// error compilacion, tipo de dato es animal
//			System.out.println(gato.getClass());
//			System.out.println(anima.getClass());
			
			//------------------------------------
			// En compilacion importa el tipo de dato
			Animal a2 = new Gato();
//			Mono  mono= new Mono();
			Mono  mono= (Mono) a2;
			
			Gato g2 = new Gato();
//			Mono m2= (Mono)g2; // errro de compilacion
			
			//En ejecucion lo importante es que sean padre --> hijo
			//En ejecucion es importante a quien se esta apuntando
			
			//------------------------------------
			
			Animal a3 = new Gato();
			Mono m3 = null;
			m3  = (Mono)a3; // error de ejecucion java.lang.ClassCastException:
			
			//------------------------------------
			Gato g4 = new Gato();
			Animal m4 = (Animal)g4; // compila y ejecuta corerctamente
			
			
			
			
			
	}

}
