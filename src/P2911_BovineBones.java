import java.util.Scanner;

public class P2911_BovineBones {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		int[] arr = new int[s1 + s2 + s3 + 1];
		for (int i = 1; i <= s1; i++) {
			for (int j = 1; j <= s2; j++) {
				for (int k = 1; k <= s3; k++) {
					arr[i + j + k]++;
				}
			}
		}
		int maxCount = Integer.MIN_VALUE;
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxCount) {
				maxCount = arr[i];
				res = i;
			}
		}
		System.out.println(res);

	}
}
