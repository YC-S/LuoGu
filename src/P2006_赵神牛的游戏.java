import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P2006_赵神牛的游戏 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int m = sc.nextInt();
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == 0) {
				list.add(i + 1);
				continue;
			}
			int damage = (k / a) * b;
			if (damage >= n) {
				list.add(i + 1);
			}
		}
		if (list.size() == 0) {
			System.out.println(-1);
		} else {
			Collections.sort(list);
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i) + " ");
			}
		}
	}
}
