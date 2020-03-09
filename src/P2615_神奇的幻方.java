import java.util.Scanner;

public class P2615_神奇的幻方 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		matrix[0][n/2] = 1;
		for (int i = 2; i <= n * n; i++) {
			int[] position = findPosition(matrix, i - 1);
			int row = position[0];
			int col = position[1];
			if (row == 0 && col != matrix[0].length - 1) {
				matrix[matrix.length - 1][col + 1] = i;
			} else if (col == matrix[0].length - 1 && row != 0) {
				matrix[row - 1][0] = i;
			} else if (row == 0 && col == matrix[0].length - 1) {
				matrix[1][matrix[0].length - 1] = i;
			} else if (row != 0 && col != matrix[0].length - 1) {
				if (row - 1 >= 0 && col + 1 < matrix[0].length && matrix[row - 1][col + 1] == 0) {
					matrix[row - 1][col + 1] = i;
				} else {
					matrix[row + 1][col] = i;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%d ", matrix[i][j]);
			}
			System.out.println();
		}
	}

	private static int[] findPosition(int[][] matrix, int x) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == x) {
					return new int[]{i, j};
				}
			}
		}
		return new int[]{};
	}
}
