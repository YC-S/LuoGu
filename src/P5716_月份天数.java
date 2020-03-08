import java.util.Scanner;

public class P5716_月份天数 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean lunar = checkLunar(a);
		int days = checkDay(b, lunar);
		System.out.println(days);
	}

	private static boolean checkLunar(int a) {
		if (a % 400 == 0) {
			return true;
		} else if (a % 4 == 0) {
			if (a % 100 == 0) {
				return false;
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	private static int checkDay(int b, boolean lunar) {
		switch (b) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				return 31;
			case 2:
				if (lunar) {
					return 29;
				} else {
					return 28;
				}
			case 4:
			case 6:
			case 9:
			case 11:
				return 30;
			default:
				break;
		}
		return 0;
	}
}
