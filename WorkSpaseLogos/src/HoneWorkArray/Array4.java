package HoneWorkArray;

public class Array4 {

	public static void main(String[] args) {
		int[] arr = new int[8];
		arrFill(arr);
		arrIndex(arr);
	}

	static void arrFill(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) Math.round(Math.random() * (10-1)+1);
			System.out.print(arr[i]+" ");
		}
				
				
		}
	static void arrIndex(int arr[]){
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			if(i%2!=0)
			arr[i]=0;
			System.out.print(arr[i]+" ");
}

		
	}
	
	
	
}
/*������� ����� � 8 ���������� ����� ����� � ������ [1; 10]. ������� ����� �� ����� � �����. 
������ ����� ������� � �������� �������� �� ����.
����� �������� ����� �� ����� �� �������� �����. */