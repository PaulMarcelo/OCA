package incremental;

public class Incremental {

	private void test(int value) {
		System.out.println("val: " + value);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Incremental inc = new Incremental();
		int var = 8;
		inc.test(var++);
		System.out.println("val: " + var);
	}

}
