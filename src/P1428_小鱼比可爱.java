import java.util.Scanner;

public class P1428_小鱼比可爱 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int[] res = new int[n];
        for (int i = 0; i < array.length; i++) {
            res[i] = 0;
            for (int j = 0; j < i; j++) {
                if (array[j] < array[i]) {
                    res[i]++;
                }
            }
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

    }
}
