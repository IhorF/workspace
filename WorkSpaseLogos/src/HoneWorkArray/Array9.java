package HoneWorkArray;

public class Array9 {

	public static void main(String[] args) {
		int[] arrFirst = new int[10];
		int[] arrSecond = new int[10];
		double[] arrThird = new double[10];
		arrFill(arrFirst);
		System.out.println();
		arrFill(arrSecond);
		arrThirdFill(arrThird, arrFirst, arrSecond);
	}

	static void arrFill(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) Math.round(Math.random() * (9 - 1) + 1);
			System.out.print(arr[i] + " ");
		}

	}

	static void arrThirdFill(double[] arr, int[] arrFirst, int[] arrSecond) {
		System.out.println();
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (double) arrFirst[i] / (double) arrSecond[i];
			if ((arr[i] - (int) arr[i]) == 0)
				k++;
			System.out.printf("%.1f; ", arr[i] );
		}
		System.out.println('\n' + "ʳ������ ����� �������� �������� ������ �������: " + k);

	}

}
/*������� ��� ������ � 10 ����� ���������� ����� � ������ [1; 9] � ����� ����� � 10 ������ �����. 
����� ������� � i-�� �������� �������� ������ ������� ���������� ��������� �������� � ������� ������
� i-�� �������� �� �������� � ������� ������ � i-�� ��������. 
������� �� ��� ������ �� ����� (����� �� �������� �����), ���� ������� ������� ����� �������� � �������� �����. */
