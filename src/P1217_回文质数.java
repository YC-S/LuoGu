import java.util.Scanner;

public class P1217_回文质数 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int i = a; i <= b; i++) {
			if (i == 9989900) break;
			if (checkPalindrome(i) && checkPrime(i)) {
				System.out.println(i);
			}
		}
	}

	private static boolean checkPrime(int n) {
		if (n < 2) return false;
		if (n == 2) return true;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) return false;
		}
		return true;
	}

	private static boolean checkPalindrome(int n) {
		int tmp = n;
		int reverse = 0;
		while (tmp != 0) {
			reverse = reverse * 10 + tmp % 10;
			tmp /= 10;
		}
		return reverse == n;
	}
}
