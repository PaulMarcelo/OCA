package com.modificadores;

public class Gato implements Animal{
	// Error de compilacion por defult es m�s restrictivo que public
	// void comer(); //==> default void comer{}
	
	@Override
	public void comer() {		
	}

	@Override
	public void dormir() {
	}

}
