package HoneWorkArray;

public class Array3 {

	public static void main(String[] args) {
		int[] arr = new int[15];
		arrFill(arr);
		arrAmount(arr);
	}

	static void arrFill(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) Math.round(Math.random() * 9);
			System.out.print(arr[i]+" ");
		}
				
				
		}
	static void arrAmount(int arr[]){
		int k=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0)
				k++;
		}
		System.out.println();
		System.out.print("� ������ ����� "+k+" ������ ����");
		
	}
	
	
	
}
/*������� ����� � 15 ���������� ����� ����� � ������ [0; 9]. 
������� ����� �� �����. ϳ�������� ������ � ����� ������ �������� �
�������� �� ������� �� ����� �� �������� �����. */