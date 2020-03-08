import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P4414_ABC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] arr = {a, b, c};
		Arrays.sort(arr);
		Map<Character, Integer> map = new HashMap<>();
		map.put('A', arr[0]);
		map.put('B', arr[1]);
		map.put('C', arr[2]);
		String str = sc.next();
		char[] array = str.toCharArray();
		int[] res = new int[3];
		for (int i = 0; i < array.length; i++) {
			res[i] = map.get(array[i]);
		}
		System.out.println(res[0] + " " + res[1] + " " + res[2]);
	}
}
