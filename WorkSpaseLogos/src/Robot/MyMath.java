package Robot;

public class MyMath {
	final static double pi = 22 / 7;
	final static double e = 2.718;

	static double ploshchaKruha(int x) {

		double s = pi * myPow(x, 2);
		return s;

	}

	static int myPow(int x, int s) {
		int r = x;
		if (s == 0)
			return 1;
		else if (s == 1)
			return x;

		for (int i = 2; i <= s; i++) {
			r = r * x;
		}

		return r;

	}

	static int min(int a, int b) {

		return a > b ? b : a;
	}
}
