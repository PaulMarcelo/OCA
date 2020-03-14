package com.ejemplos;

import java.util.ArrayList;

import com.sobreescritura.Cliente;
import com.sobreescritura.Persona;

public class Metodos3 {
	public static void main(String[] args) {
		// Definicion
		ArrayList<Persona> personas = new ArrayList<Persona>();

		personas.add(new Persona("Juan"));
		personas.add(new Persona("Mario"));
		personas.add(null);
		personas.add(new Persona("José"));

		System.out.println(personas);// imprime los objetos en memoria por que persona no tiene el to string
										// sobreescrito

		// REMOVE

		personas.remove(2);
		System.out.println(personas);

		personas.remove(new Persona("Mario"));
		System.out.println(personas);

		// ---------------------------------------
		System.out.println("------------CLIENTES (sobresecrito equals)------------");
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();

		clientes.add(new Cliente("Juan"));
		clientes.add(new Cliente("Mario"));
		clientes.add(null);
		clientes.add(new Cliente("José"));
		System.out.println(clientes);
		clientes.remove(new Cliente("Mario"));
		System.out.println(clientes);

	}
}
