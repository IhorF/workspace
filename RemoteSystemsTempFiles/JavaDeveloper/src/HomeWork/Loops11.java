package HomeWork;
/*������� �� ����� ����� 11 ����� ����������� Գ�������. 
 * ��������, �� ������ � ������ ����� ����������� ��� ��������, � ����� ��������� - ����� ���� ���������. 
 */
public class Loops11 {

	public static void main(String[] args) {
		fibonachi();

	}

	static void fibonachi() {
		int f = 1;
		int k=1;
		int a = 0;
		for (int i = 0; i < 11; i++) {
			System.out.println(f);
			f = a + k;
			a=k;
			k=f;
		
		}
	}

}
