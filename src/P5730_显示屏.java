import java.util.Scanner;

public class P5730_显示屏 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		String str = sc.next();
		char[] charArray = str.toCharArray();
		for (int i = 0; i < n; i++) {
			arr[i] = charArray[i] - '0';
		}
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		StringBuilder sb3 = new StringBuilder();
		StringBuilder sb4 = new StringBuilder();
		StringBuilder sb5 = new StringBuilder();

		for (int i = 0; i < n; i++) {
			switch (arr[i]) {
				case 0:
					sb1.append("XXX.");
					sb2.append("X.X.");
					sb3.append("X.X.");
					sb4.append("X.X.");
					sb5.append("XXX.");
					break;
				case 1:
					sb1.append("..X.");
					sb2.append("..X.");
					sb3.append("..X.");
					sb4.append("..X.");
					sb5.append("..X.");
					break;
				case 2:
					sb1.append("XXX.");
					sb2.append("..X.");
					sb3.append("XXX.");
					sb4.append("X...");
					sb5.append("XXX.");
					break;
				case 3:
					sb1.append("XXX.");
					sb2.append("..X.");
					sb3.append("XXX.");
					sb4.append("..X.");
					sb5.append("XXX.");
					break;
				case 4:
					sb1.append("X.X.");
					sb2.append("X.X.");
					sb3.append("XXX.");
					sb4.append("..X.");
					sb5.append("..X.");
					break;
				case 5:
					sb1.append("XXX.");
					sb2.append("X...");
					sb3.append("XXX.");
					sb4.append("..X.");
					sb5.append("XXX.");
					break;
				case 6:
					sb1.append("XXX.");
					sb2.append("X...");
					sb3.append("XXX.");
					sb4.append("X.X.");
					sb5.append("XXX.");
					break;
				case 7:
					sb1.append("XXX.");
					sb2.append("..X.");
					sb3.append("..X.");
					sb4.append("..X.");
					sb5.append("..X.");
					break;
				case 8:
					sb1.append("XXX.");
					sb2.append("X.X.");
					sb3.append("XXX.");
					sb4.append("X.X.");
					sb5.append("XXX.");
					break;
				case 9:
					sb1.append("XXX.");
					sb2.append("X.X.");
					sb3.append("XXX.");
					sb4.append("..X.");
					sb5.append("XXX.");
					break;
			}
		}
		System.out.println(sb1.deleteCharAt(sb1.length() - 1));
		System.out.println(sb2.deleteCharAt(sb2.length() - 1));
		System.out.println(sb3.deleteCharAt(sb3.length() - 1));
		System.out.println(sb4.deleteCharAt(sb4.length() - 1));
		System.out.println(sb5.deleteCharAt(sb5.length() - 1));
	}
}
