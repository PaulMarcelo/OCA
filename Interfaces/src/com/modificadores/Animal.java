package com.modificadores;

// Todos los metodos tiene que ser publicos caso contrario da un error de compilaci�n
public interface Animal {
	void comer(); //  ==> modificado public
	//protected void dormir(); // ==> Error de compilaci�n
	//private void dormir(); // ==> Error de compilaci�n
	//default void dormir(); // ==> Error de compilaci�n, default pertenece a una clase y deberi�a tener cuerpo el m�todo
	public void dormir(); //  ==> modificado public
}
