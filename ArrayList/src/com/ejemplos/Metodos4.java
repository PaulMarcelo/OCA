package com.ejemplos;

import java.util.ArrayList;

import com.sobreescritura.Cliente;
import com.sobreescritura.Persona;

public class Metodos4 {
	public static void main(String[] args) {
		// Definicion
		ArrayList<Persona> personas= new ArrayList<Persona>();
		
		Persona p1 = new Persona("Juan");
		personas.add(p1);
		Persona p2 = new Persona("Mario");
		personas.add(p2);
		personas.add(null);
		Persona p3 = new Persona("Jose");
		personas.add(p3);
		
		Persona p4 = new Persona("Juan");
		personas.add(p4);
		
		System.out.println(personas);
			
		personas.remove(p4);
		
		System.out.println(personas);

		
		//CLIENTES SOBREESCRITO .EQUALS
		
		
		ArrayList<Cliente> clientes= new ArrayList<Cliente>();
		Cliente c1 = new Cliente("Juan");
		Cliente c2 = new Cliente("Mario");
		Cliente c3 = new Cliente("Jose");
		Cliente c4 = new Cliente("Juan");
		
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		clientes.add(c4);
		
		clientes.remove(c4);
		System.out.println(clientes);

	}
}
