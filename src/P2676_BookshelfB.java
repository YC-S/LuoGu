import java.util.Arrays;
import java.util.Scanner;

public class P2676_BookshelfB {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();
		int B = scanner.nextInt();
		int[] array = new int[N];
		for (int i = 0; i < N; i++) {
			array[i] = scanner.nextInt();
		}
		Arrays.sort(array);
		int sum = 0;
		int count = 0;
		for (int i = array.length - 1; i >= 0; i--) {
			if (sum >= B) {
				break;
			}
			sum += array[i];
			count++;
		}
		System.out.println(count);

	}
}
