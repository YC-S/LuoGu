import java.math.BigInteger;
import java.util.Scanner;

public class P1634_禽兽的传染病 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger x = new BigInteger(String.valueOf(sc.nextInt()));
		BigInteger n = new BigInteger(String.valueOf(sc.nextInt()));
		BigInteger res = new BigInteger("1");
		for (int i = 0; i < n.longValue(); i++) {
			res = (x.add(new BigInteger("1"))).multiply(res);
		}
		System.out.println(res);
	}
}
