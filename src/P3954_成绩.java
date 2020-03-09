import java.util.Scanner;

public class P3954_成绩 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int res = (int)((double)a * 0.2 + (double)b * (0.3) + (double)c * 0.5);
		System.out.println(res);
	}
}
