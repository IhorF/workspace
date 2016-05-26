package HoneWorkArray;

public class Array2 {

	public static void main(String[] args) {
		int[] arr = new int[arrSize()];
		arrFill(arr);
		arrInLine(arr);
		arrInverse(arr);

	}

	static int arrSize() {
		int k = 0;
		for (int i = 1; i <= 99; i += 2)
			k++;
		return k;
	}

	static void arrFill(int[] arr) {
		int j = 1;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = j;
			j += 2;
		}
	}

	static void arrInLine(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	static void arrInverse(int arr[]) {
		for (int i = arr.length-1; i >= 0; i--)
			System.out.print(arr[i]+" ");
	}

}
/*Створіть масив з усіх непарних чисел від 1 до 99, виведіть його на екран у рядок, 
а потім цей же масив виведіть на екран теж в рядок, але в зворотному порядку (99 97 95 93 ... 7 5 3 1). */
