import java.util.Scanner;

public class P2241_统计方形 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long cntSquare = 0;
		long cntRectangle = 0;

		for (long i = 0; i < n; i++) {
			for (long j = 0; j < m; j++) {
//				BigInteger cnt =
//					(new BigInteger(String.valueOf(n)).add(new BigInteger(String.valueOf(-i)))).multiply((new BigInteger(String.valueOf(m)).add(new BigInteger(String.valueOf(-j)))))
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
