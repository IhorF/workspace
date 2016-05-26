package HomeWork;
/*Виведіть на екран перші 11 членів послідовності Фібоначчі. 
 * Нагадуємо, що перший і другий члени послідовності рівні одиницям, а кожен наступний - сумою двох попередніх. 
 */
public class Loops11 {

	public static void main(String[] args) {
		fibonachi();

	}

	static void fibonachi() {
		int f = 1;
		int k=1;
		int a = 0;
		for (int i = 0; i < 11; i++) {
			System.out.println(f);
			f = a + k;
			a=k;
			k=f;
		
		}
	}

}
