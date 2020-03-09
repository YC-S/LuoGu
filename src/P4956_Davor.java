import java.util.Scanner;

public class P4956_Davor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean found = false;
		for (int k = 1; ; k++) {
			for (int x = 100; x > 0 && !found; x--) {
				if ((7 * x + 21 * k) * 52 == n) {
					found = true;
					System.out.println(x);
					System.out.println(k);
					break;
				}
			}
			if (found) break;
		}
	}
}
