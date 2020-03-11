import java.util.Scanner;

public class P1321_单词覆盖还原 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] array = str.toCharArray();
		int countBoy = countBoy(array);
		int countGirl = countGirl(array);
		System.out.println(countBoy);
		System.out.println(countGirl);
	}

	private static int countBoy(char[] array) {
		int count = 0;
		if (array.length < 3) {
			return 0;
		}
		for (int i = 0; i < array.length - 2; i++) {
			if (array[i] == 'b'|| array[i + 1] == 'o' || array[i + 2] == 'y') {
				count++;
			}
		}

		return count;
	}

	private static int countGirl(char[] array) {
		int count = 0;
		if (array.length < 4) {
			return 0;
		}
		for (int i = 0; i < array.length - 3; i++) {
			if (array[i] == 'g' || array[i + 1] == 'i' || array[i + 2] == 'r' || array[i + 3] == 'l') {
				count++;
			}
		}

		return count;
	}
}
