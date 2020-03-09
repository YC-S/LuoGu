import java.util.Scanner;

public class P1179_数字统计 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = a; i <= b; i++) {
			sb.append(i);
		}
		int cnt = 0;
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == '2') {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
