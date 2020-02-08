package com.estaticos.teoria;

public class Test {

	public static void main(String[] args) {
		Count c1 = new Count();
		Count c2 = new Count();

		Count.staticValor = 10;
		c1.staticValor = 20; // funciona(compila y ejecuta) no es la forma correcta

		System.out.println(Count.staticValor);

		c1.valor = 100;
//		Count.valor = 200; //es un erro de compilacion

		// ---------------
		c1.add(); // add es metodo NO estatico
		System.out.println(c1.valor); // 101

		c1.addStatic();

	}

}
