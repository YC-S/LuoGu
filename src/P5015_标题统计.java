import java.util.Scanner;

public class P5015_标题统计 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				count++;
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				count++;
			} else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				count++;
			}
		}
		System.out.println(count);
	}
}
