import java.util.Scanner;
import java.util.TreeSet;

public class P1138_第k小整数 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		TreeSet<Integer> set = new TreeSet<>();
		for (int i = 0; i < n; i++) {
			set.add(scanner.nextInt());
		}
		if (set.size() < k) {
			System.out.println("NO RESULT");
		} else {
			for (int i = 0; i < k - 1; i++) {
				set.remove(set.first());
			}
			System.out.println(set.first());

		}
	}
}
