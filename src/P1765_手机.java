import java.util.Scanner;

public class P1765_手机 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] one = {'a', 'd', 'g', 'j', 'm', 'p', 't', 'w', ' '};
		char[] two = {'b', 'e', 'h', 'k', 'n', 'q', 'u', 'x'};
		char[] three = {'c', 'f', 'i', 'l', 'o', 'r', 'v', 'y'};
		char[] four = {'s', 'z'};
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			int t = str.charAt(i);
			for (char a : one) {
				if (a == t) {
					count++;
					break;
				}
			}
			for (char b : two) {
				if (b == t) {
					count += 2;
					break;
				}
			}
			for (char c : three) {
				if (c == t) {
					count += 3;
					break;
				}
			}
			for (char d : four) {
				if (d == t) {
					count += 4;
					break;
				}
			}
		}
		System.out.println(count);
	}
}
