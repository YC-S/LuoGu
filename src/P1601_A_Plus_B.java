import java.math.BigInteger;
import java.util.Scanner;

public class P1601_A_Plus_B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = new BigInteger(sc.next());
		BigInteger b = new BigInteger(sc.next());
		System.out.println(a.add(b));
	}
}