import java.util.Scanner;

public class P1423_小玉在游泳 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double target = sc.nextDouble();
        int step = 1;
        double curStep = 2;
        double totalDistance = 2;
        while (totalDistance < target) {
            curStep = curStep * .98;
            totalDistance += curStep;
            step++;
        }
        System.out.println(step);
    }
}
