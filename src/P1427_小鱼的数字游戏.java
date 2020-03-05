import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P1427_小鱼的数字游戏 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (sc.hasNext()) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            } else {
                list.add(num);
            }
        }
        Collections.reverse(list);
        for (int i : list) {
            System.out.print(i + " ");
        }
    }

}
