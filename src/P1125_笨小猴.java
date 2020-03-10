import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P1125_笨小猴 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] arr = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for (char key: map.keySet()) {
			max = Math.max(map.get(key), max);
			min = Math.min(map.get(key), min);
		}
		if (prime(max - min)) {
			System.out.println("Lucky Word");
			System.out.println(max - min);
		} else {
			System.out.println("No Answer");
			System.out.println(0);
		}
	}

	private static boolean prime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
