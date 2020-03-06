import java.util.Scanner;

public class P1308_统计单词数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toLowerCase();
        String line = sc.nextLine().toLowerCase();
        String line2 = line.trim();
        int difference = line.indexOf(line2);
        int count = 0;
        String[] array = line2.split(" ");
        for (int i = 0; i < array.length; i++) {
            if (word.equals(array[i])) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println(-1);
        } else {
            int position = line.indexOf(word);
            System.out.println(count + " " + position);
        }


    }
}
