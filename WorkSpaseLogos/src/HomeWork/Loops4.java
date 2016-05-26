package HomeWork;

public class Loops4 {
	public static void main(String[] args) {
		progression();
	}

	static void progression() {
		int p = 2;
		for (int i = 0; i < 20; i++) {
			System.out.println(p);
			p*=2;
		}
	}
}