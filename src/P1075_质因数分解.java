import java.util.Scanner;

public class P1075_质因数分解 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (isPrime(n)) {
			System.out.println(n);
		} else {
			for (int i = 2; i <= n; i++) {
				if (n % i == 0) {
					System.out.println(n / i);
					break;
				}
			}
		}
	}

	private static boolean isPrime(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
