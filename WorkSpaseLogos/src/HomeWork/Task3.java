package HomeWork;

public class Task3 {
/* �������� ��������, �� �������� �� ����� ��������� �� 10 � ���� �����, ��������� � ���� m � n. 
 * ���������, ����� ����� 8,5 � 11,45 ��������� �� ������ 11,45.
 */
	public static void main(String[] args) {
		near(8.6, 8.6);
		
	}
	static void near(double m, double n){
		
		if(Math.abs(10-m)>Math.abs(10-n))
			System.out.println("��������� �� 10 � ���� �������� ����� "+m+" � "+n+" � "+n);
		else if(m==n)
			System.out.println("����� ���");
		else
			System.out.println("��������� �� 10 � ���� �������� ����� "+m+" � "+n+" � "+m);
	}
}
