import java.util.Scanner;

public class P5734_文字处理软件 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String st = sc.next();

		StringBuilder sb = new StringBuilder();
		sb.append(st);
		for (int i = 0; i < n; i++) {
			byte x = sc.nextByte();
			switch (x) {
				case 1:
					sb.append(sc.next());
					System.out.println(sb);
					break;
				case 2:
					int a = sc.nextInt();
					int b = sc.nextInt();
					sb = new StringBuilder(sb.substring(a, a + b));
					System.out.println(sb);
					break;
				case 3:
					int c = sc.nextInt();
					String str = sc.next();
					sb.insert(c, str);
					System.out.println(sb);
					break;
				case 4:
					String s = sc.next();
					System.out.println(sb.indexOf(s));
					break;
			}
		}
	}
}
