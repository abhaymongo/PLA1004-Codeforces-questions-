import java.io.*;
 
public class Main {
 
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0;
        private int len = 0;
 
        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
 
                if (len <= 0) {
                    return -1;
                }
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
 
        FastScanner sc = new FastScanner();
        StringBuilder out = new StringBuilder();
 
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
 
        int[] diff = new int[200002];
 
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
 
            diff[l]++;
            diff[r + 1]--;
        }
 
        int[] prefix = new int[200002];
 
        int count = 0;
 
        for (int i = 1; i <= 200000; i++) {
            count += diff[i];
 
            if (count >= k) {
                prefix[i] = 1;
            }
        }
 
        // Prefix sum of acceptable temperatures
        for (int i = 1; i <= 200000; i++) {
            prefix[i] += prefix[i - 1];
        }
 
        while (q-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
 
            out.append(prefix[r] - prefix[l - 1]).append('
');
        }
 
        System.out.print(out);
    }
}