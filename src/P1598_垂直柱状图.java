import java.util.Scanner;

public class P1598_垂直柱状图 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            sb.append(sc.nextLine());
        }
        int[] array = new int[26];
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) <= 'Z' && sb.charAt(i) >= 'A') {
                array[sb.charAt(i) - 'A']++;
            }
        }

        int maxLength = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxLength) {
                maxLength = array[i];
            }
        }

        char[][] matrix = new char[maxLength][51];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i % 2 == 0 && j < array[i / 2]) {
                    matrix[matrix.length - 1 - j][i] = '*';
                } else {
                    matrix[matrix.length - 1 - j][i] = ' ';
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        for (char i = 0; i < 25; i++) {
            char ch = (char) ('A' + i);
            System.out.print(ch + " ");
        }
        System.out.print('Z');
    }
}
