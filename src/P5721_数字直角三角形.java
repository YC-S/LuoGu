import java.util.Scanner;

public class P5721_数字直角三角形 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 1;
		for (int i = n; i >= 1; i--) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < i; j++, cnt++) {
				if (cnt < 10) {
					sb.append("0").append(cnt);
				} else {
					sb.append(cnt);
				}
			}
			System.out.println(sb);
		}
	}
}
