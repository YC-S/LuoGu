import java.util.Scanner;

public class P1421_小玉买文具 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int penPrice = 10 + 9;
    int a = sc.nextInt();
    int b = sc.nextInt();
    int total = a * 10 + b;
    System.out.println(total / penPrice);
  }
}
