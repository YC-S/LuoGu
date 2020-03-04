import java.util.Scanner;

public class P1422_小玉家的电费 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    double total = 0;
    if (a >= 401) {
      total += (a - 400) * 0.5663;
      a = 400;
    }
    if (a >= 151) {
      total += (a - 150) * 0.4663;
      a = 150;
    }
    total += a * 0.4463;
    System.out.printf("%.1f", total);
  }
}
