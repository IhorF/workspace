package Game;

import java.util.Scanner;

public class HresticNolik {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] battle = new int[3][3];
		boolean isRun = true;
		while (isRun) {
			cpuShot(battle);
			print(battle);
			userShot(battle, sc);
			print(battle);
			isRun = isAllFieldFull(battle);
			if (!isRun) {
				System.out.println("Winner");
			}
		}
		sc.close();
	}

	static boolean isAllFieldFull(int[][] battle) {
		int f;
		for (int i = 0; i < battle.length; i++) {
			f = 0;
			for (int j = 0; j < battle[i].length; j++) {
				if (battle[j][j] == 2){
					f++;
				}else if (battle[i][j] == 2) {
					f++;
				} else if (battle[j][i] == 2) {
					f++;
				} else if (battle[2][0] > 0 && battle[1][1] > 0 && battle[0][2] > 0)
					return false;
			}
			if (f == 3)
				return false;
		}
		return true;
	}

	static void userShot(int[][] battle, Scanner sc) {
		System.out.println("Enter from 1 to 3 by x coordinate");
		int y = read(sc) - 1;
		System.out.println("Enter from 1 to 3 by y coordinate"); 
		int x = read(sc) - 1;
		battle[x][y] = 2;
	}

	static void cpuShot(int[][] battle) {
		boolean isShoted = true;
		while (isShoted) {
			int x = random(0, 2);
			int y = random(0, 2);
			if (battle[x][y] == 0) {
				isShoted = false;
				battle[x][y] = 1;
			}
		}
	}

	static void print(int[][] battle) {
		System.out.println("--------------------------");
		for (int i = 0; i < battle.length; i++) {
			for (int j = 0; j < battle[i].length; j++) {
				if (battle[i][j] == 0) {
					System.out.print("  ");
				} else if (battle[i][j] == 1) {
					System.out.print("x ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------------");
	}

	static int random(int from, int to) {
		int r = (int) Math.round(Math.random() * (to - from) + from);
		return r;
	}

	static int read(Scanner sc) {
		if (sc.hasNextInt()) {
			return sc.nextInt();
		}
		return 0;
	}
}