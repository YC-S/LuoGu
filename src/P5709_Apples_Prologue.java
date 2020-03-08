import java.util.Scanner;

public class P5709_Apples_Prologue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int t = sc.nextInt();
		int s = sc.nextInt();
		if (t == 0) {
			System.out.println(m);
		} else {
			double finished = Math.ceil((double)s / (double)t);
			if ((int)(m - finished) < 0) {
				System.out.println(0);
			} else {
				System.out.println((int) (m - finished));
			}
		}
	}
}
