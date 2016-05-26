package HoneWorkArray;

public class Array7 {

	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		
		int[] arr = new int[20];
		arrFill(arr);
		long finish=System.currentTimeMillis();
		System.out.println(finish-start);
	}
	static void arrFill(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (i < 2) {
				arr[i] = 1;
			} else {
				arr[i] = arr[i - 2] + arr[i - 1];
			}
			System.out.print(arr[i] + " ");
		}
	}
}
/*
 * Створіть масив з 20-ти перших чисел Фібоначчі і виведіть його на екран.
 * Нагадуємо, що перший і другий члени послідовності рівні одиницям, а кожен
 * наступний - сумою двох попередніх.
 */