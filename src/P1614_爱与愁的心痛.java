import java.util.Scanner;

public class P1614_爱与愁的心痛 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] res = new int[n - m + 1];
		for (int i = 0; i < m; i++) {
			res[0] += arr[i];
		}
		int min = res[0];
		for (int i = 1; i < n - m; i++) {
			res[i] = res[i - 1] - arr[i - 1] + arr[i + m - 1];
			min = Math.min(min, res[i]);
		}
		System.out.println(min);
	}
}
