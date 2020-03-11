import java.util.Scanner;

public class P5461_赦免战俘 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = (int) Math.pow(2, n);
		byte[][] matrix = new byte[l][l];
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][l - 1] = 1;
		}
		for (int i = 1; i < l; i++) {
			for (int j = 0; j < l - 1; j++) {
				matrix[i][j] = (byte)(matrix[i - 1][j] ^ matrix[i - 1][j + 1]);
			}
		}
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < l; j++) {
				System.out.printf("%d ", matrix[i][j]);
			}
			System.out.println();
		}
	}
}
