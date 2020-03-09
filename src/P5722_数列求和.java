import java.util.Scanner;

public class P5722_数列求和 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int res = 0;
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			res += i;
		}
		System.out.println(res);
	}
}
