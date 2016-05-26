package HoneWorkArray;

public class Array5 {

	public static void main(String[] args) {
		int[] arrFirst = new int[5];
		int[] arrSecond = new int[5];
		System.out.println("Перший масив: ");
		arrFill(arrFirst);
		System.out.println("Другий масив: ");
		arrFill(arrSecond);
		// arrBig(arrAction(arrFirst),arrAction(arrSecond));
		double k = arrAction(arrFirst);
		double k1 = arrAction(arrSecond);

		System.out.println("Середнє арифметичне першого масиву: " + k);
		System.out.println("Середнє арифметичне доугого масиву: " + k1);
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
			System.out.println("Середнє арифметичне першого масиву більше");
		else if (arrSum == arr1Sum)
			System.out.println("Середні арифметичні у масивів рівні");
		else
			System.out.println("Середнє арифметичне другого масиву більше");
	}
}
/*Створіть 2 масиви з 5 випадкових цілих чисел з відрізка [0; 5] кожен, виведіть масиви на екран у двох окремих рядках. 
Порахуйте середнє арифметичне елементів кожного масиву і 
повідомте, для якого з масивів це значення виявилося більше (або повідомте, що їх середні арифметичні рівні). */