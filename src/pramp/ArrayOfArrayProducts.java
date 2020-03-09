package pramp;

import java.util.Arrays;

public class ArrayOfArrayProducts {
	public static int[] arrayOfArrayProducts(int[] arr) {
		// your code goes here
		// time: n * (n - 1) = O(n)
		// space: O(n)
		if (arr == null) {
			return arr;
		}
		if (arr.length == 1) {
			return new int[0];
		}

		int[] res = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			res[i] = 1;
			for (int j = 0; j < arr.length; j++) {
				if (i != j) {
					res[i] *= arr[j];
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] a = {8, 10, 2};
		int[] b = {2, 7, 3, 4};
		System.out.println(Arrays.toString(arrayOfArrayProducts(a)));
		System.out.println(Arrays.toString(arrayOfArrayProducts(b)));
	}
}
