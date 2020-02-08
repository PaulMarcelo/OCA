package com.herencia.ejecucion;

public class Test {

	public static void main(String[] args) {
		Vehicle v1 = new Auto();
		Vehicle v2 = new Airplane();
		v2 = (Vehicle) v1;
		// Compilacion v1 es Vehicle y hago cast a Vehicle
		// Ejecucion v1 apunta a Auto y hago un cast a Vehicle --> vehicle es papá
		Auto a = (Auto) v2;
		// Compilacion v2 es Vehicle y hago cast a Auto -- relacion de herencia
		// Ejecucion v2 apunta a Auto y hago un cast a Auto --> mismo tipo
		Vehicle v3 = a; //apunta a auto
		v3.move();  // en ejecucion es importante a quien apunto y se ejecuta los metodos que pertenece a quien apunto
//		v3.autoMove();//propio de auto , tipo de dato es vehicle poe eso no  le ve
	}

}
