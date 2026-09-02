import java.io.*;
import java.util.*;
 
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
 
        FastScanner sc = new FastScanner();
        StringBuilder out = new StringBuilder();
 
        int n = sc.nextInt();
 
        int[] prices = new int[n];
 
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
 
        Arrays.sort(prices);
 
        int q = sc.nextInt();
 
        while (q-- > 0) {
 
            int x = sc.nextInt();
 
            int left = 0;
            int right = n;
 
            while (left < right) {
 
                int mid = left + (right - left) / 2;
 
                if (prices[mid] <= x) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
 
            out.append(left).append('
');
        }
 
        System.out.print(out);
    }
}