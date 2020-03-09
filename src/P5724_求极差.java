import java.util.Scanner;

public class P5724_求极差 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			if (tmp < min) {
				min = tmp;
			}
			if (tmp > max) {
				max = tmp;
			}
		}
		System.out.println(max - min);
	}
}
