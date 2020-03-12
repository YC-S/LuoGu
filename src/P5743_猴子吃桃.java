import java.util.Scanner;

public class P5743_猴子吃桃 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = helper(n);
		System.out.println(res);
	}

	private static int helper(int n) {

		int res = 1;
		for (int i = 1; i < n; i++) {
			res = (res + 1) * 2;
		}
		return res;
	}
}
