import java.util.Scanner;

class P3741_honoka的键盘 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		char[] array = str.toCharArray();
		int res = helper(n, array);
		System.out.println(res);
	}

	private static int helper(int n, char[] array) {
		int count = 0;
		if (n == 1) {
			return 0;
		}
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == 'V' && array[i + 1] == 'K') {
				array[i] = 'X';
				array[i + 1] = 'X';
				count++;
				i++;
			}
		}
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == 'V' && array[i + 1] == 'V'
				|| (array[i] == 'K' && array[i + 1] == 'K')) {
				count++;
				break;
			}
		}
		return count;
	}
}
