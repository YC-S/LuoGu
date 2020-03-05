import java.util.Scanner;

public class P1424_小鱼的航程_改进版 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b - 1;
        int total = 0;
        while (a <= c) {
            if (a % 7 <= 5 && a % 7 >= 1) {
                total += 250;
            }
            a++;
        }
        System.out.println(total);
    }
}
