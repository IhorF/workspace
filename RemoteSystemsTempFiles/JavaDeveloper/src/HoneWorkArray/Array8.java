package HoneWorkArray;

public class Array8 {

	public static void main(String[] args) {
		int[] arr = new int[12];
		arrFill(arr);
		arrMax(arr);
	}

	static void arrFill(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) Math.round(Math.random() * (15+15)-15);
			System.out.print(arr[i]+" ");
		}
				
				
		}
	static void arrMax(int arr[]){
		System.out.println();
		int max=-15;
		int index=0;
		for (int i = 0; i < arr.length-1; i++) {
			if(max<= arr[i]){
			max=arr[i];
			index=i;
		}
			}
			System.out.print("������������ ������� ������: " +max+" � ���� ������ " +index);
}

		
	}
	
/*������� ����� � 12 ���������� ����� ����� � ������ [-15; 15]. 
�������� ���� ������� � � ����� ����� ������������ � 
�������� ������ ���� ���������� ��������� � �����. */
	

