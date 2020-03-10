import java.util.Scanner;

public class P5731_蛇形方阵 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = (int)Math.ceil(1.0 * n / 2);
		int num = 1;
		int[][] a = new int[12][12];
		for (int i = 0; i < t; i++) {
			for (int j = i; j < n - i; j++) {
				a[i][j] = num++;
			}
			for (int j = i + 1; j < n - i - 1; j++) {
				a[j][n - i - 1] = num++;
			}
			for (int j = n - i - 1; j > i; j--) {
				a[n - i - 1][j] = num++;
			}
			for (int j = n - i - 1; j > i; j--) {
				a[j][i] = num++;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
	}
}
