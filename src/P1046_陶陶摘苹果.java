import java.util.Scanner;

public class P1046_陶陶摘苹果 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.next();
    String[] numString = s1.split(" ");
    int[] array = new int[numString.length];
    for (int i = 0; i < array.length; i++) {
      array[i] = Integer.parseInt(numString[i]);
    }
    int count = 0;
    int height = Integer.parseInt(s2);
    for (int i = 0; i < array.length; i++) {
      if (height + 30 >= array[i]) {
        count++;
      }
    }
    System.out.println(count);
  }
}
