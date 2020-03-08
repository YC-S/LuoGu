import java.util.Scanner;

public class P5719_分类平均 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int countA = 0;
		int sumA = 0;
		int countB = 0;
		int sumB = 0;
		for (int i = 1; i <= n; i++) {
			if (i % k == 0) {
				countA++;
				sumA += i;
			} else {
				countB++;
				sumB += i;
			}
		}
		System.out.printf("%.1f", (double) sumA / countA);
		System.out.print(" ");
		System.out.printf("%.1f", (double) sumB / countB);
	}
}
