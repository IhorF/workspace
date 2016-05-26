package HomeWork;
/*Виведіть на екран всі позитивні подільники натурального числа, введеного користувачем з клавіатури.*/
import java.util.Scanner;

public class Loops8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Введіть натуральне число:");
		int i=s.nextInt();
		s.close();
		devide(i);
	}

	static void devide(int d) {
		System.out.println("Дане число має такі цілі дільники:");
		for (int i = 1; i <= d; i++) {
			if (d % i == 0)
				System.out.println(i);
		}

	}

}
