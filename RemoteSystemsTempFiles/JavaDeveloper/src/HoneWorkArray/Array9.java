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
		System.out.println('\n' + "Кількість цілих елементів третього масиву дорівнює: " + k);

	}

}
/*Створіть два масиви з 10 цілих випадкових чисел з відрізка [1; 9] і третій масив з 10 дійсних чисел. 
Кожен елемент з i-им індексом третього масиву повинен дорівнювати відношенню елементу з першого масиву
з i-им індексом до елементу з другого масиву з i-им індексом. 
Вивести всі три масиву на екран (кожен на окремому рядку), потім вивести кількість цілих елементів в третьому масиві. */
