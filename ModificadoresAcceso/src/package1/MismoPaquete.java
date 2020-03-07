package package1;

public class MismoPaquete {
	public void probarAcceso() {
		Contenedor c = new Contenedor();
		c.varPublic = 10;
		c.varProtected = 10;
		c.varDefault = 10;
		// c.varPrivate = 10; // no puedo verla
	}
}
