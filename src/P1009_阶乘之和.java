import java.math.BigInteger;
import java.util.Scanner;

public class P1009_阶乘之和 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger res = new BigInteger("0");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			BigInteger tmp = new BigInteger("1");
			for (int j = 1; j <= i; j++) {
				tmp = tmp.multiply(new BigInteger(String.valueOf(j)));
			}
			res = res.add(tmp);
		}
		System.out.println(res);
	}
}
