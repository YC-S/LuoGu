import java.util.Scanner;

public class P1957_口算练习题 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] operators = new String[n];
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == ' ') {
					count++;
				}
			}
			String operator = " ";
			String[] arr = str.split(" ");
			if (count == 2) {
				operator = arr[0];
				doCalculation(operator, arr[1], arr[2]);
			} else {
				operator = operators[i - 1];
				doCalculation(operator, arr[0], arr[1]);
			}
			operators[i] = operator;
		}
	}

	private static void doCalculation(String operator, String a, String b) {
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		switch (operator) {
			case "a":
				String s = x + "+" + y + "=" + (x + y);
				System.out.println(s);
				System.out.println(s.length());
				break;
			case "b":
				s = x + "-" + y + "=" + (x - y);
				System.out.println(s);
				System.out.println(s.length());
				break;
			case "c":
				s = x + "*" + y + "=" + (x * y);
				System.out.println(s);
				System.out.println(s.length());
				break;
			default:
				break;

		}

	}
}
