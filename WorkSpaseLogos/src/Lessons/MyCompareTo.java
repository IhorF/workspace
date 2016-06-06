package Lessons;

public class MyCompareTo {

	public static void main(String[] args) {
		Human h = new Human();
		Object o = new Human();
	
		h.walk();
		Human h2=(Human) o;
		h2.walk();
		Human hTest=new Hunter(-10,0);
		System.out.println(hTest);
		
		
	
	}

	static int compareTo(String str1, String str2) {
		for (int i = 0; i < str1.length() && i < str2.length(); i++) {
			if (str1.codePointAt(i) != str2.codePointAt(i));
			{
				return str1.codePointAt(i) - str2.codePointAt(i);

			}
		}
		return str1.length() - str2.length();
	}
}