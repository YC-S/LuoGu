import java.util.Scanner;

public class P1089_津津的储蓄计划 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int inHand = 0;
        int save = 0;
        boolean lessThanZero = false;
        while (i < 12) {
            int num = sc.nextInt();
            inHand = inHand + (300 - num);
            if (inHand < 0) {
                System.out.println(-(i + 1));
                lessThanZero = true;
                break;
            }
            if (inHand / 100 > 0) {
                save += (inHand / 100) * 100;
                inHand = inHand % 100;
            }
            i++;
        }
        save = (int) (save * 1.2);
        if (!lessThanZero) {
            System.out.println(save + inHand);
        }
    }

}
