import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P1554_梦中的统计 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[10];
		StringBuilder sb = new StringBuilder();
		for (int i = m; i <= n; i++) {
			sb.append(i);
		}
		for (int i = 0; i < sb.length(); i++) {
			arr[sb.charAt(i) - '0']++;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
