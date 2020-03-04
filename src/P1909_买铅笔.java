import java.util.Scanner;

public class P1909_买铅笔 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNum = Integer.parseInt(sc.nextLine());
        int totalSum = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            String str = sc.nextLine();
            String[] arr = str.split(" ");
            int curSum = (int) Math.ceil((double) totalNum / Integer.parseInt(arr[0])) * Integer.parseInt(arr[1]);
            totalSum = Math.min(totalSum, curSum);
        }
        System.out.println(totalSum);
    }
}