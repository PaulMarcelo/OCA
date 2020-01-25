package operadorTernario;

public class Test {

	public static void main(String[] args) {
		int edad = 90;
		String tipo;
		tipo = (edad > 50) ? "Mayor de Edad" : "Menor de Edad";
		System.out.println(tipo);

		edad = 20;
		if (edad > 50)
			tipo = "Adulto Mayor";
		else if (edad < 18)
			tipo = "Menor de edad";
		else
			tipo = "Adulto";
		System.out.println(tipo);

		tipo = (edad > 50) ? "Adulto Mayor" : (edad < 18) ? "Menor de edad" : "Adulto";
		System.out.println(tipo);

	}
}
