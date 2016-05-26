package HomeWork;

import java.util.Scanner;

public class Loops7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("¬вед≥ть натуральне число:");
		int i=s.nextInt();
		s.close();
		System.out.println("‘актор≥ал введеного числа = "+factorial(i));
		
	}
static int factorial(int x){
	int f = 1;
	for(int i=0;i<x;i++)
		f=f*(i+1);
	return f;
}
}
