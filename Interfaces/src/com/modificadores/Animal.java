package com.modificadores;

// Todos los metodos tiene que ser publicos caso contrario da un error de compilación
public interface Animal {
	void comer(); //  ==> modificado public
	//protected void dormir(); // ==> Error de compilación
	//private void dormir(); // ==> Error de compilación
	//default void dormir(); // ==> Error de compilación, default pertenece a una clase y deberiía tener cuerpo el método
	public void dormir(); //  ==> modificado public
}
