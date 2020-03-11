import java.util.Scanner;

public class P5740_最厉害的学生 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		int chinese = 0;
		int math = 0;
		int english = 0;
		String str = "";
		int[] scores = new int[3];
		for (int i = 0; i < n; i++) {
			String tmp = sc.next();
			int cur = 0;
			chinese = sc.nextInt();
			math = sc.nextInt();
			english = sc.nextInt();
			cur += chinese + math + english;
			if (cur > max) {
				max = cur;
				str = tmp;
				scores[0] = chinese;
				scores[1] = math;
				scores[2] = english;
			}
		}
		System.out.printf("%s %d %d %d", str, scores[0], scores[1], scores[2]);
	}
}
