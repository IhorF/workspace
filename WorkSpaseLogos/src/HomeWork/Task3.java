package HomeWork;

public class Task3 {
/* Створити програму, що виводить на екран найближче до 10 з двох чисел, записаних в змінні m і n. 
 * Наприклад, серед чисел 8,5 і 11,45 найближче до десяти 11,45.
 */
	public static void main(String[] args) {
		near(8.6, 8.6);
		
	}
	static void near(double m, double n){
		
		if(Math.abs(10-m)>Math.abs(10-n))
			System.out.println("Найближче до 10 з двох введених чисел "+m+" і "+n+" є "+n);
		else if(m==n)
			System.out.println("Числа рівні");
		else
			System.out.println("Найближче до 10 з двох введених чисел "+m+" і "+n+" є "+m);
	}
}
