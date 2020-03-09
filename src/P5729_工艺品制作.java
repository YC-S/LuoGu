import java.io.*;
import java.util.StringTokenizer;

public class P5729_工艺品制作 {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader sc = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		int w = sc.nextInt();
		int x = sc.nextInt();
		int h = sc.nextInt();
		int[][][] cube = new int[w][x][h];
		int count = 0;
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int x1 = sc.nextInt();
			int x2 = sc.nextInt();
			int x3 = sc.nextInt();
			int y1 = sc.nextInt();
			int y2 = sc.nextInt();
			int y3 = sc.nextInt();
			for (int j = x1; j <= y1; j++) {
				for (int k = x2; k <= y2; k++) {
					for (int l = x3; l <= y3; l++) {
						if (cube[j][k][l] == 1) continue;
						cube[j][k][l] = 1;
						count++;
					}
				}
			}
		}
		System.out.println(w * x * h - count);
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
