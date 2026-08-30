import java.io.*;
 
public class Main {
 
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
 
        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }
 
        int nextInt() throws IOException {
            int c;
 
            do {
                c = read();
            } while (c <= ' ');
 
            int num = 0;
 
            while (c > ' ') {
                num = num * 10 + (c - '0');
                c = read();
            }
 
            return num;
        }
    }
 
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
 
        int n = fs.nextInt();
        int k = fs.nextInt();
 
        int[] a = new int[n];
 
        long sum = 0;
 
        for (int i = 0; i < n; i++) {
            a[i] = fs.nextInt();
 
            if (i < k) {
                sum += a[i];
            }
        }
 
        long minSum = sum;
        int answer = 1;
 
        for (int i = k; i < n; i++) {
            sum = sum - a[i - k] + a[i];
 
            if (sum < minSum) {
                minSum = sum;
                answer = i - k + 2;
            }
        }
 
        System.out.println(answer);
    }
}