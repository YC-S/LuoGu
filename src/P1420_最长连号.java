import java.util.Scanner;

public class P1420_最长连号 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n + 1];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int maxLength = 1;
		int cur = 1;
		for (int i = 1; i < n; i++) {
			if (arr[i] - arr[i-1] == 1) {
				cur++;
				maxLength = Math.max(cur, maxLength);
			} else {
				cur = 1;
			}
		}
		System.out.println(maxLength);
	}
}
