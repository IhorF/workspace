package HomeWork;

public class Loops1 {
/*  Створіть програму, що виводить на екран всі чотиризначні числа послідовності 1000 1003 1006 1009 1012 1015.
 * 
 */
	public static void main(String[] args) {
		progression();
		
	}
static void progression(){
	for(int i=1000; i<=1015;i+=3)
		System.out.println(i);
	
}
}
