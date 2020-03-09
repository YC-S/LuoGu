import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P5727_冰雹猜想 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		list.add(n);
		foo(n, list);
		Collections.reverse(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

	private static void foo(int n, List<Integer> list) {
		if (n == 1) {
			return;
		}

		if (n % 2 == 1) {
			n = 3 * n + 1;
		} else {
			n /= 2;
		}
		list.add(n);
		foo(n, list);
	}
}
