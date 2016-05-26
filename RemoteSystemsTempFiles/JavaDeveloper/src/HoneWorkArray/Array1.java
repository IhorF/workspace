package HoneWorkArray;

public class Array1 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		arr(arr);
		arrInLine(arr);
		arrInColumn(arr);
	}

	static void arr(int arr[]){
			int x=2;
			for (int i=0;i<10;i++){
				arr[i]=x;
				x+=2;
			}
	}
	
static void arrInLine(int arr[]){
	for (int i=0;i<arr.length;i++)
		System.out.print( arr[i]+" ");
	System.out.println();
	}
	static void arrInColumn(int arr[]){
		for (int i=0;i<10;i++)
			System.out.println( arr[i]+" ");
	}
	
}
/*
Створіть масив з усіх парних чисел від 2 до 20 і виведіть елементи масиву на екран спочатку в рядок, 
відокремлюючи один елемент від іншого прогалиною, а потім в стовпчик (відокремлюючи один елемент від іншого початком нового рядка).
Перед створенням масиву подумайте, якого він буде розміру. */
