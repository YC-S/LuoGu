import java.util.*;

public class P2550_彩票摇奖 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < 7; i++) {
			set.add(sc.nextInt());
		}

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < 7; j++) {
				int tmp = sc.nextInt();
				if (set.contains(tmp)) {
					count++;
				}
			}
			if (count == 7) {
				map.put(0, map.getOrDefault(0, 0) + 1);
			} else {
				map.put(7 - count, map.getOrDefault(7 - count, 0) + 1);
			}
		}
		for (int i = 0; i < 7; i++) {
			System.out.print(map.getOrDefault(i, 0) + " ");
		}
	}
}
