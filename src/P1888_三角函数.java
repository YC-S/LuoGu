import java.util.Arrays;
import java.util.Scanner;

public class P1888_三角函数 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] arr = new int[3];
		int cd1 = gcd(a, b);
		int cd2 = gcd(b, c);
		if (cd1 == cd2) {
			arr = new int[]{a / cd1, b / cd1, c / cd1};
		} else {
			arr = new int[]{a, b, c};
		}
		Arrays.sort(arr);
		System.out.println(arr[0] + "/" + arr[2]);
	}

	private static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, b % a);
	}


}
