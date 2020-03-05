import java.util.Scanner;

public class P1980_计数问题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= a; i++) {
            sb.append(i);
        }
        int count = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) - 48 == b) {
                count++;
            }
        }
        System.out.println(count);
    }
}
