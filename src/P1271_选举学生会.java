import java.util.Arrays;
import java.util.Scanner;

public class P1271_选举学生会 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] array = new int[m];
		for (int i = 0; i < m; i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d ", array[i]);
		}
	}
}
