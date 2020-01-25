package constructores.teoria;
//Cuando no se declara un constructor, java lo crea por defecto.
//Los constructores pueden ser sobrecargados,
//Cuando se define un constructor, java no pone por defecto el constructor vacio.
public class Animal {

	String nombre;
	
	//Constructor vacio
	public Animal() {}
	
	//Constructor sobrecargado
	public Animal(String nombre) {
		this.nombre= nombre;
	}
	

	
	
}

//Error de compilacion.- es un error que lo marca el IDE, por mal escrito, no ejecuta
//Error de ejecucion.- 