package HomeWork;
/* ������� ��������, �� �������� �� ����� 12 ������ �������� ����������� � ������ 2an-2, �� a1 = 3 � a2 = 2. */
public class Loops10 {

	public static void main(String[] args) {
		progression();
	}

	static void progression() {
		int p;
		for (int a = 3; a > -9; a--) {
			p = 2 * a - 2;
			System.out.println(p);
		}
	}
}
