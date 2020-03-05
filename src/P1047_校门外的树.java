import java.util.Scanner;

public class P1047_校门外的树 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        boolean[] occupied = new boolean[l + 1];
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int j = a; j <= b; j++) {
                occupied[j] = true;
            }
        }
        int count = 0;
        for (boolean b : occupied) {
            if (!b) {
                count++;
            }
        }
        System.out.println(count);
    }
}
