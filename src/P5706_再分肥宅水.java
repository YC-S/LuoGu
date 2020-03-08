import java.util.Scanner;

public class P5706_再分肥宅水 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		int b = sc.nextInt();
		System.out.printf("%.3f", a / (double) b);
		System.out.println("\n" + b * 2);
	}
}
