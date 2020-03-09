import java.util.Scanner;

public class P5739_计算阶乘 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(factory(n));
	}

	private static int factory(int n) {
		if (n == 1) {
			return 1;
		}
		return factory(n - 1) * n;
	}
}
