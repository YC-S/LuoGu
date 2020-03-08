import java.util.Scanner;

public class P5718_找最小值 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			min = Math.min(sc.nextInt(), min);
		}
		System.out.println(min);
	}
}
