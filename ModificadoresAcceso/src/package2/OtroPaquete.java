package package2;

import package1.Contenedor;

public class OtroPaquete {
	public void probarAcceso() {
		Contenedor c = new Contenedor();
		c.varPublic = 10;
//		c.varProtected = 10;
//		c.varDefault = 10;
		// c.varPrivate = 10; // no puedo verla
	}
}
