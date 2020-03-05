import java.io.*;
import java.util.StringTokenizer;

public class P1200_你的飞碟在这儿 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        String a = in.next();
        String b = in.next();
        int numA = 1;
        int numB = 1;
        for (int i = 0; i < a.length(); i++) {
            numA *= (a.charAt(i)-64);
        }
        for (int i = 0; i < b.length(); i++) {
            numB *= (b.charAt(i)-64);
        }
        if (numA % 47 == numB % 47) {
            out.println("GO");
        } else {
            out.println("STAY");
        }
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

