package package2;

import package1.Contenedor;

public class OtroPaquete2 extends Contenedor{
	OtroPaquete2 c = new OtroPaquete2();
	public void probarAcceso() {
		
		c.varPublic = 10;
		c.varProtected = 10;
//		c.varDefault = 10;
		// c.varPrivate = 10; // no puedo verla
	}
	
	public static void main(String[] args) {
		Boolean b = new Boolean("tRUe");
		int x;
		if(b == true) {
			x=10;
		}else {
			x=0;
		}
		System.out.println(x);
	}
	
}
 