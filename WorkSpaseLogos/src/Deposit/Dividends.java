package Deposit;

import java.util.Scanner;

public class Dividends {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Скільки Вам років?");
		int year = sc.nextInt();
		System.out.println("В скільки років плануєте вийти на пенсію?");
		int end = sc.nextInt();
		System.out.println("Яку суму Ви можете відкласти в рік?");
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
			System.out.printf("Після " + (i + 1) + " року вкладень Ваш дохід становитиме %.2f грн.\n", arr[i]);

		}

	}

}
