package HomeWork;

public class Loops5 {
	public static void main(String[] args) {
		progression();
	}

	static void progression() {
		int p;
		for (int a = 2; (p = 2 * a - 1) < 10000; a++) {
			System.out.println(p);
		}
	}
}
