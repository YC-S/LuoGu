import java.util.Scanner;

public class P1304_哥德巴赫猜想 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 4; i <= n; i+=2) {
			for (int j = 2; j <= i; j++) {
				int k = i - j;
				if (prime(j) && prime(k) && (j <= k)) {
					System.out.printf("%s=%s+%s\n", i, j, k);
					break;
				}
			}
		}
	}

	private static boolean prime(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
