import java.math.BigInteger;
import java.util.Scanner;

public class P2415_集合求和 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		BigInteger res = new BigInteger("1");


		int x = 0;
		int i = 0;
		for (int r = 0; r < arr.length; r++) {
			x += Integer.parseInt(arr[r]);
			i++;
		}
		res =
			res.multiply(new BigInteger(String.valueOf(x))).multiply(new BigInteger(String.valueOf((int)Math.pow(2, i - 1))));
		System.out.println(res);
	}
}
