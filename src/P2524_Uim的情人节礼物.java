import java.util.Scanner;

public class P2524_Uim的情人节礼物 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		char[] charArray = str.toCharArray();
		long res = 0;
		int[] arr = new int[charArray.length];
		for (int i = 0; i < charArray.length; i++) {
			arr[i] = charArray[i] - '0';
		}
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] - i - 1 > 0) {
				int count = 0;
				for (int j = 0; j < i; j++) {
					if (arr[j] < arr[i]) count++;
				}
				res += factorial(arr.length - i - 1) * (arr[i] - count - 1);
			}
		}
		System.out.println(res + 1);
	}


	private static long factorial(int n) {
		long res = 1;
		for (int i = 1; i <= n; i++) {
			res *= i;
		}
		return res;
	}
}
