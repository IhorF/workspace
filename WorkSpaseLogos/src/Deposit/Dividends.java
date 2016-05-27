package Deposit;

import java.util.Scanner;

public class Dividends {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ��� ����?");
		int year = sc.nextInt();
		System.out.println("� ������ ���� ������� ����� �� �����?");
		int end = sc.nextInt();
		System.out.println("��� ���� �� ������ �������� � ��?");
		double money = sc.nextDouble();
		sc.close();
		result(arrayFillDividends(arrayInitialize(year, end), money, 19));
	}

	static double[] arrayInitialize(int year, int end) {
		double arr[] = new double[end - year];
		return arr;
	}

	static double[] arrayFillDividends(double arr[], double money, double rate) {
		double cash = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (money + cash) * (1 + rate / 100);
			cash = arr[i];
		}
		return arr;
	}

	static void result(double arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("ϳ��� " + (i + 1) + " ���� �������� ��� ����� ����������� %.2f ���.\n", arr[i]);

		}

	}

}
