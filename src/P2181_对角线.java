import java.math.BigInteger;
import java.util.Scanner;

public class P2181_对角线 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int x = Integer.parseInt(str);
		BigInteger a = new BigInteger(str);
		if (a.longValue() < 3) {
			System.out.println(0);
		} else {
			BigInteger res = a.multiply(new BigInteger(String.valueOf(x - 1))).divide(new BigInteger("2")).multiply(new BigInteger(String.valueOf(x - 2))).divide(new BigInteger("3")).multiply(new BigInteger(String.valueOf(x - 3))).divide(new BigInteger("4"));
			System.out.println(res);
		}
	}
}
