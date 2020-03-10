import java.util.Scanner;

public class P2084_进制转换 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		String str = sc.next();
		int len = str.length();
		int carry = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) - '0' == 0) {
				continue;
			}
			sb.append((str.charAt(i) - '0') + "*" + m + "^" + (len - 1 - i) + "+");
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb);
	}
}
