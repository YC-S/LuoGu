import java.util.*;

public class P1059_明明的随机数 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			set.add(sc.nextInt());
		}
		List<Integer> list = new ArrayList<>();
		for (int i : set) {
			list.add(i);
		}
		System.out.println(list.size());
		Collections.sort(list);
		for (int i : list) {
			System.out.printf("%d ", i);
		}
	}
}
