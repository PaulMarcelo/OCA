package incremental;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 3;
		System.out.println("Count: " + count++); // 3 -> el incremento se hace efctivo la sig vez qeu se utiliza
		System.out.println("Count: " + count); // 4 -> Ya se hizo efectivo el incremento
		System.out.println("Count: " + ++count); // 5 -> el incremento se hace efectivo en ese momento
	}

}
