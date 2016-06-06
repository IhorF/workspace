package Lessons;

public class JavaCore1 {

	public static void main(String[] args) {

		System.out.println("Hello+R+11101".compareTo("Hello+R+111012"));
		System.out.println(myCompareTo("Hello+R+11101", "Hello+R+111012"));
	}

	static public int myCompareTo(String str1, String str2) {

		int strLength;   
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		if (str1.length() > str2.length())
			strLength = str2.length();
		else
			strLength = str1.length();

		for (int i = 0; i < strLength; i++) {
			
			if(ch1[i]!=ch2[i])
			return ch1[i]-ch2[i];
			
		}

		return 0+str1.length()-str2.length();
	}
}