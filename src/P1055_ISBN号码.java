import java.io.*;
import java.util.StringTokenizer;

public class P1055_ISBN号码 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        String str = in.next();
        StringBuilder strb = new StringBuilder(str);
        String[] strArr = str.split("-");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length - 1; i++) {
            sb.append(strArr[i]);
        }
        char[] targetArray = strArr[strArr.length - 1].toCharArray();
        char target = targetArray[0];
        int total = 0;
        for (int i = 0; i < sb.length(); i++) {
            total += (sb.charAt(i) - 48) * (i + 1);
        }
        if (target >= 48 && target <= 57) {
            int targetInt = target - 48;
            if (total % 11 == targetInt) {
                out.println("Right");
            } else if (total % 11 != 10){
                strb.deleteCharAt(strb.length() - 1);
                int rightNumber = total % 11;
                strb.append(rightNumber);
                out.println(strb);
            } else {
                strb.deleteCharAt(strb.length() - 1);
                strb.append("X");
                out.println(strb);
            }
        } else {
            if (total % 11 == 10) {
                out.println("Right");
            } else {
                strb.deleteCharAt(strb.length() - 1);
                int rightNumber = total % 11;
                strb.append(rightNumber);
                out.println(strb);
            }
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
