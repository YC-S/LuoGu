import java.util.Scanner;

public class P2669_金币 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int m = 0;
		int n = 0;
		for (int i = 0; i <= k; i++) {
			if (k - (i * (i - 1) / 2) <= i) {
				n = i;
				m = k - (i * (i - 1) / 2);
				break;
			}
		}
		int res = n * (n - 1) * (2 * n - 1) / 6 + m * n;
		System.out.println(res);

	}
}
