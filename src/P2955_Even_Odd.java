import java.math.BigInteger;
import java.util.Scanner;

public class P2955_Even_Odd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			if (str.charAt(str.length() - 1) % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		}
	}
}
