package HoneWorkArray;

public class Array5 {

	public static void main(String[] args) {
		int[] arrFirst = new int[5];
		int[] arrSecond = new int[5];
		System.out.println("������ �����: ");
		arrFill(arrFirst);
		System.out.println("������ �����: ");
		arrFill(arrSecond);
		// arrBig(arrAction(arrFirst),arrAction(arrSecond));
		double k = arrAction(arrFirst);
		double k1 = arrAction(arrSecond);

		System.out.println("������ ����������� ������� ������: " + k);
		System.out.println("������ ����������� ������� ������: " + k1);
		arrBig(k, k1);
	}

	static void arrFill(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) Math.round(Math.random() * 5);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	static double arrAction(int arr[]) {
		int sum = 0;
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			k++;
		}
		return (double) sum / k;

	}

	static void arrBig(double arrSum, double arr1Sum) {
		if (arrSum > arr1Sum)
			System.out.println("������ ����������� ������� ������ �����");
		else if (arrSum == arr1Sum)
			System.out.println("������ ���������� � ������ ���");
		else
			System.out.println("������ ����������� ������� ������ �����");
	}
}
/*������� 2 ������ � 5 ���������� ����� ����� � ������ [0; 5] �����, ������� ������ �� ����� � ���� ������� ������. 
��������� ������ ����������� �������� ������� ������ � 
��������, ��� ����� � ������ �� �������� ��������� ����� (��� ��������, �� �� ������ ���������� ���). */