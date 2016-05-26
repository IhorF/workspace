package Lessons;

import java.util.Scanner;

public class Rand {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isRun = true;
		while (isRun) {
			System.out
					.println("Введіть число до якого ви хочете щоб комп загадав");

			int userChoise = read(sc);
			int cpu = random(1, userChoise);

			game(cpu, userChoise, sc);
			System.out.println("Якщо хочете пограти ще раз введіть 1");
			if (read(sc) != 1) {
				isRun = false;
			}
		}
		sc.close();

	}

	static void game(int cpu, int userChoise, Scanner sc) {
		boolean isRun = true;
		int count = 0;
		while (isRun) {
			count++;
			System.out.println("Введіть число від 1 до " + userChoise);
			isRun = everyStep(cpu, sc, count);
		}
	}

	static boolean everyStep(int cpu, Scanner sc, int count) {

		int user = read(sc);
		return everyStepMessage(user, cpu, count);
	}

	static boolean everyStepMessage(int user, int cpu, int count) {
		if (user == cpu) {
			System.out.println("Ви виграли");
			System.out.println("Ви використали " + count + " спроб");
			return false;
		} else {
			System.out.println("Ви не вгадали");
			if (user > cpu) {
				System.out.println("Ви ввели завелике число");
			} else {
				System.out.println("Ви ввели замале число");
			}
			return true;

		}

	}

	static int read(Scanner sc) {
		if (sc.hasNextInt()) {
			return sc.nextInt();
		}
		return 0;

	}

	static int random(int from, int to) {
		int r = (int) Math.round(Math.random() * (to - from) + from);
		return r;
	}
}
