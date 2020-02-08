package com.estaticos.teoria;

public class Count {

	int valor;
	static int staticValor;

	public void add() {
		valor++;
	}

	public static void addStatic() {
		valor++; // error de compilacion no se puede acceder a variables y metodos no estaticas
	}
}
