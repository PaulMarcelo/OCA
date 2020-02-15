package com.excepciones.teoria;

public class Test {

	public static void main(String[] args) {

	}

	public void m1() throws Exception {
		throw new Exception(); // Checked necesita en la firma del checked
	}

	public void m2() throws RuntimeException { // no es obligatorio es opcional
		throw new RuntimeException();
	}

	public void m10() throws Exception {

	}

	public void m11() throws RuntimeException {

	}

	public void test() {
		try {
			m1();
			m10();
		} catch (Exception e) {
			System.out.println(e);
		}
		m2();
		m11();
	}

	public void test2() throws Exception {
		m1();
		m10();
		m2();
		m11();
	}

	public void m3() {
		throw new MyException();
	}

	public void m4() throws AnotherException {
		throw new AnotherException();
	}

}
