import java.util.Scanner;

public class P4327_Okviri {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] array = str.toCharArray();
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		StringBuilder sb3 = new StringBuilder();
		StringBuilder sb4 = new StringBuilder();
		StringBuilder sb5 = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			if ((i + 1) % 3 == 1 && i != 0) {
				sb1.append("..#.");
				sb2.append(".#.#");
				sb3.append("*.").append(array[i]).append(".");
				sb4.append(".#.#");
				sb5.append("..#.");
			} else if ((i + 1) % 3 != 0) {
				sb1.append("..#.");
				sb2.append(".#.#");
				sb3.append("#.").append(array[i]).append(".");
				sb4.append(".#.#");
				sb5.append("..#.");
			} else {
				sb1.append("..*.");
				sb2.append(".*.*");
				sb3.append("*.").append(array[i]).append(".");
				sb4.append(".*.*");
				sb5.append("..*.");
			}
		}
		if (array.length % 3 == 0) {
			sb1.append(".");
			sb2.append(".");
			sb3.append("*");
			sb4.append(".");
			sb5.append(".");
		} else {
			sb1.append(".");
			sb2.append(".");
			sb3.append("#");
			sb4.append(".");
			sb5.append(".");
		}
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);
		System.out.println(sb4);
		System.out.println(sb5);
	}
}
