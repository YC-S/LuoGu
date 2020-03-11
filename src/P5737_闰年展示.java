import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P5737_闰年展示 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = a; i <= b; i++) {
			if (checkLunar(i)) {
				list.add(i);
			}
		}
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%d ", list.get(i));
		}
	}

	private static boolean checkLunar(int year) {
		if (year % 400 == 0) {
			return true;
		} else if (year % 4 == 0) {
			if (year % 100 == 0) {
				return false;
			} else {
				return true;
			}
		}
		return false;
	}
}
