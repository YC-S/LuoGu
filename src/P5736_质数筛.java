import java.util.Scanner;

public class P5736_质数筛 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int t = sc.nextInt();
			check(t);
		}
	}


	private static void check(int t) {
		if (t < 2) {
			return;
		}
		for (int i = 2; i * i <= t; i++) {
			if (t % i == 0) {
				return;
			}
		}
		System.out.printf("%d ", t);
	}
}
