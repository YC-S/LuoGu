import java.util.Scanner;

public class P2670_扫雷游戏 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] matrix = new char[n][m];
		char[][] result = new char[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				result[i][j] = '0';
			}
		}
		for (int i = 0; i < n; i++) {
			String tmp = sc.next();
			for (int j = 0; j < m; j++) {
				char temp = tmp.charAt(j);
				matrix[i][j] = temp;
				if (temp == '*') {
					result[i][j] = '*';
					if (i + 1 < n) {
						result[i + 1][j]++;
						if (j + 1 < m) {
							result[i + 1][j + 1]++;
						}
					}
					if (i - 1 >= 0) {
						result[i - 1][j]++;
						if (j - 1 >= 0) {
							result[i - 1][j - 1]++;
						}
					}
					if (j + 1 < m) {
						result[i][j + 1]++;
						if (i - 1 >= 0) {
							result[i - 1][j + 1]++;
						}
					}
					if (j - 1 >= 0) {
						result[i][j - 1]++;
						if (i + 1 < n) {
							result[i + 1][j - 1]++;
						}
					}
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (matrix[i][j] == '*') {
					result[i][j] = '*';
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}


	}
}
