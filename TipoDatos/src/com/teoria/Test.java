package com.teoria;

public class Test {
	public static void main(String[] args) {
		int x = 10;
		byte b;
//		b = x; // error de compilacion byte es de menor tamaño que int

		float f1 = 10;
		float f2 = 10;

		// casting
		int x1 = 0;
		short s;
		s = (short) x1;// realiza el cast de datos truncando el valor al tamaño de short.


		// unboxing

		Integer i1 = 10; // new Integer(10)
		int i2 = i1; // unboxing i1.intValue()

		System.out.println(i2);
		
		
		
		
		
	}

}
