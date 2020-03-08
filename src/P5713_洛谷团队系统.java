import java.util.Scanner;

public class P5713_洛谷团队系统 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int local = 5 * a;
		int luogu = 11 + 3 *  a;
		if (local < luogu) {
			System.out.println("Local");
		} else {
			System.out.println("Luogu");
		}
	}
}
