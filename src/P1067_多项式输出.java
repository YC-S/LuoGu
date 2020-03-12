import java.util.Scanner;

public class P1067_多项式输出 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = n; i >= 0; i--) {
			int x = sc.nextInt();
			if (x != 0) {
				if (i != n && x > 0) sb.append("+");
				if (Math.abs(x) > 1 || i == 0) sb.append(x);
				if (x == -1 && i != 0) sb.append("-");
				if (i > 1) sb.append("x^").append(i);
				if (i == 1) sb.append("x");
			}
		}
		System.out.println(sb);
	}
}
