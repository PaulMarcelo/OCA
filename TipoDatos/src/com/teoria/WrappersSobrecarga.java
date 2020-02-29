package com.teoria;

public class WrappersSobrecarga {
	public void m1(int x) {
		System.out.println("int");
	}

	public void m1(long x) {
		System.out.println("long");
	}

	public void m1(Integer x) {
		System.out.println("Integer");
	}

	public void m1(Double x) {
		System.out.println("Double");
	}

	public static void main(String[] args) {
		WrappersSobrecarga ws=new WrappersSobrecarga();ws.m1(10); // int.- mismo tipo de dato
		ws.m1(15L);// long
		short x=15;ws.m1(x);

		// literals
		int a1=3100;int a2=3_100; // "_"tiene que esta entre dos numeros
		int a3=_3100; // error de compilacion
		float a4=566_.46; // error de compilacion
		float a5=566.46_ f; // error de compilacion

		// concatenacion (sumar un entero y un string siempre da como resultado un
		// string)
		System.out.println("Valor: "+4+5); // Valor: 45
		System.out.println("Valor: "+(4+5)); // Valor: 9
		System.out.println("Valor: "+(4)+(5)); // Valor: 45

	}
}
