import java.util.Arrays;
import java.util.Scanner;

public class P2141_珠心算测验 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int count = 0;

        Arrays.sort(array);
        boolean[] check = new boolean[n];
        for (int i = array.length - 1; i >= 2; i--) {
            for (int j = i - 1; j >= 1; j--) {
                for (int k = j - 1; k >= 0; k--) {
                    if (array[i] == array[j] + array[k] && check[i] == false) {
                        count++;
                        check[i] = true;
                    }
                }
            }
        }
        System.out.println(count);
    }

}
