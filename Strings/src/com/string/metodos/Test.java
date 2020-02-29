package com.string.metodos;

public class Test {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("cadena");
		System.out.println(sb);

		StringBuffer sb0 = new StringBuffer(4);
		sb0.append("asdasdasd");
		System.out.println(sb0);

		System.out.println("Apuntador : " + sb);
		System.out.println("cadena : " + sb.toString());

		// Concat , APPEND

		String s1 = "abc"; // new String("abc");
		String s2 = s1.concat("z");

		System.out.println(s1); // abc
		System.out.println(s2); // abcz

		StringBuffer sb1 = new StringBuffer("abc");
		sb1.append("z");
		System.out.println(sb1); // abcz
		sb1.append(1);
		System.out.println(sb1); // abcz
		sb1.append(true);
		System.out.println(sb1); // abcz

		// REPLACE

		String s3 = "Carolina";
		String s4 = s3.replace("a", "b");
		System.out.println(s3);
		System.out.println(s4);
		StringBuffer sb2 = new StringBuffer("Carolina");
		sb2.replace(0, 4, "abc");
		System.out.println(sb2);
		StringBuffer sb3 = new StringBuffer("Carolina");
		sb3.replace(2, 10, "abc");
		System.out.println(sb3);
//		sb3.replace(8, 10, "abc");
		System.out.println(sb3);

//		sb2.replace(0, 4, "abc"); // excepcion  indexoutofbounds

		// DELETE INSERT

		StringBuffer sb4 = new StringBuffer("El perro esta en la casa");
		// sb4.insert(25, "algo"); error de index outof bounds
		sb4.insert(8, "Firulais");
		sb4.delete(8, 17);

		System.out.println(sb4);
//		s3.insert(); Strin no tiene metodo insert

		// charAt, indexOf length
		String s5 = "Carolina";
		StringBuffer sb5 = new StringBuffer("Carolina");
		System.out.println(s5.charAt(7));
		System.out.println(sb5.charAt(7));

		// s5.charAt(8) StringIndexOutBounds
		// sb5.charAt(8) StringIndexOutBounds

		System.out.println(s5.indexOf("a"));
		System.out.println(sb5.indexOf("a"));

		System.out.println(s5.indexOf("aro")); // 1
		System.out.println(sb5.indexOf("ero")); // -1 cuando no encuentra el indice devuelve el -1

		System.out.println(s5.indexOf("a", 4)); // 7
		System.out.println(sb5.indexOf("a", 4)); // 7

		System.out.println(s5.length());
		System.out.println(sb5.length());

		// substring
		String s6 = s5.substring(4);
		String s7 = s5.substring(4, 5);
		System.out.println(s6); // lina
		System.out.println(s7); // l

		StringBuffer sb6 = new StringBuffer(sb5.substring(4));
		System.out.println(sb6);

		// equalsIgnoreCase

		String s8 = "perro";
		String s9 = "PeRRo";

		System.out.println(s8.equals(s9));
		System.out.println(s8.equalsIgnoreCase(s9));

	}
}
