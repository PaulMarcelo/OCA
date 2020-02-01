package arreglos.teoria;

public class Indice {

	public static void main(String[] args) {
		int x[] = new int[4];

		x[3] = 10;
		// x[4] = 8; // error de desborde de tamaño error de ejecucion -> ArrayIndexBoundException

		int values[] = new int[4];
		values[0] = 3;
		values[1] = values[0]++;
		values[2] = values[1]++;
		for (int i : values) {
			System.out.println(i);
		}

	}
}
