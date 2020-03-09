import java.util.Scanner;

public class P1720_月落乌啼算钱 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double x = Math.pow(((1 + Math.sqrt(5)) / 2), n);
		double y = Math.pow(((1 - Math.sqrt(5)) / 2), n);
		double fn = (x - y) / (Math.sqrt(5));
		System.out.printf("%.2f", fn);
	}
}
