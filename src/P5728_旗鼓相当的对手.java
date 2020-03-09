import java.util.Scanner;

public class P5728_旗鼓相当的对手 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] matrix = new int[n][3];
		int[] sum = new int[n];
		for (int i = 0; i < n; i++) {
			int s = 0;
			for (int j = 0; j < 3; j++) {
				int tmp = sc.nextInt();
				matrix[i][j] = tmp;
				s += tmp;
			}
			sum[i] = s;
		}

		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if ((Math.abs(matrix[i][0] - matrix[j][0]) <= 5)
				&& (Math.abs(matrix[i][1] - matrix[j][1]) <= 5)
				&& (Math.abs(matrix[i][2] - matrix[j][2]) <= 5)
				&& (Math.abs(sum[i] - sum[j]) <= 10)) {
					count++;
				}
			}
		}

		System.out.println(count);
	}
}
