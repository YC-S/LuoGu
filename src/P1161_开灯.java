import java.util.*;

public class P1161_开灯 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer, Boolean> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			double a = sc.nextDouble();
			int b = sc.nextInt();
			for (int j = 1; j <= b; j++) {
				int k = (int) (a * j);
				map.put(k, !map.getOrDefault(k, false));
			}
		}
		int max = 0;
		for (int i : map.keySet()) {
			if (map.get(i) == true && i > max) {
				max = i;
			}
		}
		System.out.println(max);
	}
}
