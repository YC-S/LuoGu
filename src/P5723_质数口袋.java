import java.util.Scanner;

public class P5723_质数口袋 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cur = 0;
		int count = 0;
		if (n < 2) {
			System.out.println("0");
		} else if (n == 2) {
			System.out.println("2\n1");
		} else {
			for (int i = 2; i <= n; i++) {
				if (cur + i <= n && check(i)) {
					cur += i;
					count++;
					System.out.println(i);
				}
			}
			System.out.println(count);
		}
	}

	private static boolean check(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
