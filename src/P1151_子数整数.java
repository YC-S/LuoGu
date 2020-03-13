import java.util.Scanner;

public class P1151_子数整数 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		for (int i = 10000; i <= 30000; i++) {
			int x = i / 100;
			int y = i % 10000 / 10;
			int z = i % 1000;
			if (x % n == 0 && y % n == 0 && z % n == 0) {
				System.out.println(i);
				cnt++;
			}
		}
		if (cnt == 0) {
			System.out.println("No");
		}
	}
}
