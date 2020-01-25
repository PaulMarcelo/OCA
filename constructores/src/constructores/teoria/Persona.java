package constructores.teoria;

public class Persona {

	String nombre;
	int edad;

	// Constructores sobrecargados
	public Persona(String nombre) {
		this.nombre = nombre;
	}

	// Dentro de un constructor se puede llamar a otro constructor sobrecargado de
	// la misma clase y pasar los parametros, mediante la funcion this()
	// y este debe ser la primera linea de ejcucion, caso contrario se produce un
	// erro de compilacion.
	// this() .- llama al constructor vacio, si no esta definido dicho constructor
	// dara un error de compilaciòn.
	public Persona(String nombre, int edad) {
		// super(); // constructor del padre, todos los objetos en java heredan de
		// Object
		// no se puede ejecutar los dos metodos juntos this() y super(), pues necesitan
		// ser la
		// primera linea de compilacion cada uno.
		this(nombre);
		this.edad = edad;
	}

}
