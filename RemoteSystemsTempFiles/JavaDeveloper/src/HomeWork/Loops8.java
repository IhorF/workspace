package HomeWork;
/*������� �� ����� �� �������� ��������� ������������ �����, ��������� ������������ � ���������.*/
import java.util.Scanner;

public class Loops8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("������ ���������� �����:");
		int i=s.nextInt();
		s.close();
		devide(i);
	}

	static void devide(int d) {
		System.out.println("���� ����� �� ��� ��� �������:");
		for (int i = 1; i <= d; i++) {
			if (d % i == 0)
				System.out.println(i);
		}

	}

}
