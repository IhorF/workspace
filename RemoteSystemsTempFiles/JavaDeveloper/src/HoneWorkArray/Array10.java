package HoneWorkArray;

public class Array10 {

	public static void main(String[] args) {
		int[] arr = new int[11];
		arrFill(arr);
		arrIndex(arr);
	}

	static void arrFill(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) Math.round(Math.random() * 2 - 1);
			System.out.print(arr[i] + " ");
		}

	}

	static void arrIndex(int arr[]) {
		int k = 0;
		int s = 0;
		int f = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				k++;
			else if (arr[i] == -1)
				s++;
			else
				f++;
		}
		if(k>s&&k>f)
		System.out.print("\n��������� � ����� ����������� ������� 0: "+k+" ����");
		else if(s>k&&s>f)
			System.out.print("\n��������� � ����� ����������� ������� -1: "+s+" ����");
		else if(f>k&&f>s)
			System.out.print("\n��������� � ����� ����������� ������� 1: "+f+" ����");
	}

}
/*������� ����� � 11 ���������� ����� ����� � ������ [-1; 1], ������� ����� �� ����� � �����.
�������� ���� ������� ����������� � ����� ��������� � 
������� ��� �� ����������� �� �����. ���� ��� ������� �������� ������������ �������� ������� ����, 
�� �� �������� �����. */
