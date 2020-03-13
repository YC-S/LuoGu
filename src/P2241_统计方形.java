import java.util.Scanner;

public class P2241_统计方形 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		int cntSquare = 0;
		int cntRectangle = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				long cnt = (n - i) * (m - j);
				if (i == j) {
					cntSquare += cnt;
				} else {
					cntRectangle += cnt;
				}
			}
		}
		System.out.printf("%d %d", cntSquare, cntRectangle);
	}
}
