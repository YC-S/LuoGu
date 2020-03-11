import java.util.Scanner;

public class P5735_距离函数 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double x3 = sc.nextDouble();
		double y3 = sc.nextDouble();
		double total =
			distance(x1, y1, x2, y2) + distance(x2, y2, x3, y3) + distance(x3,
				y3, x1, y1);
		System.out.printf("%.2f", total);
	}

	private static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}
}
