import java.util.Scanner;

public class P5710_数的性质 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		if (a % 2 == 0 && a > 4 && a <= 12) {
			System.out.print("1 ");
		} else {
			System.out.print("0 ");
		}
		if (a % 2 == 0 || (a > 4 && a <= 12)) {
			System.out.print("1 ");
		} else {
			System.out.print("0 ");
		}
		if ((a % 2 == 0 && !(a > 4 && a <= 12)) || (a % 2 != 0) && (a > 4 && a <= 12)) {
			System.out.print("1 ");
		} else {
			System.out.print("0 ");
		}
		if (a % 2 != 0 && !(a > 4 && a <= 12)) {
			System.out.print("1 ");
		} else {
			System.out.print("0 ");
		}
	}
}
