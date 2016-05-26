package HoneWorkArray;

public class Array6 {

	public static void main(String[] args) {
		int[] arr = new int[4];
		arrFill(arr);
		arrGrowing(arr);
	}

	static void arrFill(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) Math.round(Math.random() * (99 - 10) + 10);
			System.out.print(arr[i] + " ");
		}

	}

	static void arrGrowing(int arr[]) {
		System.out.println();
		int k = 0;
		for (int i = 0; i < arr.length - 1; i++)
			if (arr[i] < arr[i + 1])
				k++;
			else
				k = 0;
		if (k == 3)
			System.out.print("����� ����� ������ ����������");
		else
			System.out.print("����� ����� �� ������ ����������");

	}

}
/*������� ����� � 4 ���������� ����� ����� � ������ [10; 99],
������� ���� �� ����� � �����. ��������� � ������� �� ����� ����������� ��� ��, 
�� � ����� ������ ��������� �����������. */