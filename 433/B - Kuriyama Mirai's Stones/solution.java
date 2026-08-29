import java.io.*;
import java.util.*;
 
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
 
        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();
 
        int n = fs.nextInt();
 
        int[] a = new int[n + 1];
        int[] sorted = new int[n + 1];
 
        for (int i = 1; i <= n; i++) {
            a[i] = fs.nextInt();
            sorted[i] = a[i];
        }
 
        Arrays.sort(sorted);
 
        long[] prefixOriginal = new long[n + 1];
        long[] prefixSorted = new long[n + 1];
 
        for (int i = 1; i <= n; i++) {
            prefixOriginal[i] = prefixOriginal[i - 1] + a[i];
            prefixSorted[i] = prefixSorted[i - 1] + sorted[i];
        }
 
        int q = fs.nextInt();
 
        while (q-- > 0) {
 
            int type = fs.nextInt();
            int l = fs.nextInt();
            int r = fs.nextInt();
 
            if (type == 1) {
                out.append(prefixOriginal[r] - prefixOriginal[l - 1]);
            } else {
                out.append(prefixSorted[r] - prefixSorted[l - 1]);
            }
 
            out.append('
');
        }
 
        System.out.print(out);
    }
}