import java.util.PriorityQueue;
import java.util.Scanner;

public class P1085_不高兴的津津 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] array = new int[7][2];
    PriorityQueue<Pair> pq = new PriorityQueue<Pair>(
      (Pair o1, Pair o2) -> {
        if (o1.getNumber() == o2.getNumber()) {
          return Integer.compare(o1.getWeekday(), o2.getWeekday());
        } else {
          return Integer.compare(o2.getNumber(), o1.getNumber());
        }
      }
    );
    for (int i = 0; i < array.length; i++) {
      String str = sc.nextLine();
      String[] strArray = str.split(" ");
      array[i][0] = i + 1;
      array[i][1] = Integer.parseInt(strArray[0]) + Integer.parseInt(strArray[1]);
      if (array[i][1] > 8) {
        pq.add(new Pair(array[i][0], array[i][1]));
      }
    }
    System.out.println(pq.peek().getWeekday());
  }
}

class Pair {

  private int weekday;
  private int number;

  public Pair(int weekday, int number) {
    this.weekday = weekday;
    this.number = number;
  }

  public int getWeekday() {
    return weekday;
  }

  public int getNumber() {
    return number;
  }
}