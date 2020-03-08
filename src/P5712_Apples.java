import java.util.Scanner;

public class P5712_Apples {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a == 0) {
			System.out.println("Today, I ate 0 apple.");
		} else if (a == 1) {
			System.out.println("Today, I ate 1 apple.");
		} else {
			System.out.println("Today, I ate " + a +" apples.");
		}
	}
}
