import java.util.Scanner;

public class P1150_Peter的烟 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int res = n;
		while ((double)n / k >= 1) {
			int more = n / k;
			n = n % k + more;
			res += more;
		}
		System.out.println(res);
	}
}
