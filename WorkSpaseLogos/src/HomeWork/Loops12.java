package HomeWork;
/*Äëÿ çàïèñàíîãî â çì³ííó n íàòóğàëüíîãî ÷èñëà ïîğàõóéòå ñóìó âñ³õ éîãî öèôğ (çàçäàëåã³äü íå â³äîìî ñê³ëüêè öèôğ áóäå â ÷èñë³).  */

public class Loops12 {

	public static void main(String[] args) {
		System.out.println(suma(1111111111));
	}

	static int suma(int s) {
		int k = 0;
		while (s > 0) {
			k = k + (s % 10);
			s = s / 10;
		}
		return k;

	}

}
