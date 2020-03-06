import java.util.Scanner;

public class P1914_小书童_密码 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        n = n % 26;
        String word = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if ((char)(c + n) <= 'z') {
                sb.append((char)(c + n));
            } else {
                sb.append((char)(c + n - 'z' + 'a' - 1));
            }
        }
        System.out.println(sb);
    }
}
