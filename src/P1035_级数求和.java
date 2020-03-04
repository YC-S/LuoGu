import java.util.Scanner;

public class P1035_级数求和 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    double res = 0;
    int i = 1;
    while (res <= k) {
      res += (double) 1 / i;
      i++;
    }
    System.out.println(i - 1);
  }
}
