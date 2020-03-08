import java.util.Scanner;

public class P5705_数字反转 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] arr = str.split("\\.");
		System.out.println(reverse(arr[1]) + "." + reverse(arr[0]));
	}

	private static String reverse(String str) {
		String res = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			res += str.charAt(i);
		}
		return res;
	}
}
