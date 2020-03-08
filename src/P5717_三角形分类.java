import java.util.Arrays;
import java.util.Scanner;

public class P5717_三角形分类 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] arr = {a, b, c};
		Arrays.sort(arr);
		if (a <= 0 || b <= 0 || c <= 0 || arr[0] + arr[1] <= arr[2]) {
			System.out.println("Not triangle");
		} else {
			if (Math.pow(arr[0], 2) + Math.pow(arr[1], 2) == Math.pow(arr[2], 2)) {
				System.out.println("Right triangle");
			} else if (Math.pow(arr[0], 2) + Math.pow(arr[1], 2) > Math.pow(arr[2],
				2)) {
				System.out.println("Acute triangle");
			} else {
				System.out.println("Obtuse triangle");
			}
			if (arr[0] == arr[1]) {
				System.out.println("Isosceles triangle");
			}
			if (arr[0] == arr[1] && arr[1] == arr[2]) {
				System.out.println("Equilateral triangle");
			}
		}
	}
}
