import java.util.Scanner;

public class P1307_数字反转 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean negative = false;
		int res = 0;
		if (n == 0) {
			System.out.println(res);
		} else if (n < 0) {
			negative = true;
		} else {
			negative = false;
		}
		n = Math.abs(n);
		while (n != 0) {
			res = res * 10 + n % 10;
			n /= 10;
		}
		System.out.println(negative ? -res : res);
	}
}
