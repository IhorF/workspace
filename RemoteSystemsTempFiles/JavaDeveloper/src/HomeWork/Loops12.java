package HomeWork;
/*��� ���������� � ����� n ������������ ����� ��������� ���� ��� ���� ���� (���������� �� ����� ������ ���� ���� � ����).  */

public class Loops12 {

	public static void main(String[] args) {
		System.out.println(suma(1111111111));
	}

	static int suma(int s) {
		int k = 0;
		while (s > 0) {
			k = k + (s % 10);
			s = s / 10;
		}
		return k;

	}

}
