import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P1567_统计天数 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        int curLongest = 0;
        int max = 0;
        int prev = -10;
        for (int i = 0; i < n; i++) {
            int cur = in.nextInt();
            if (cur > prev) {
                curLongest++;
                max = Math.max(max, curLongest);
            } else {
                curLongest = 1;
            }
            prev = cur;
        }
        out.println(max);
        out.close();

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public char[] nextCharArray() {
            return next().toCharArray();
        }
    }
}
