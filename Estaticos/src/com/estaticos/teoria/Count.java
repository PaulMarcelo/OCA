package com.estaticos.teoria;

public class Count {

	int valor;
	static int staticValor;

	public void add() {
		valor++; 
		staticValor++; //  === Count.staticValor++
		this.valor = 5;
		this.staticValor = 10; // Count.staticValue = 10;
	}

	public static void addStatic() {
		//valor++; // error de compilacion no se puede acceder a variables y metodos no estaticas
		//add(); 
		staticValor++;
		this.valor = 5; // this no existe en mètodos estaticos
		this.staticValor =10; // this no existe en mètodos estaticos
	}
}
