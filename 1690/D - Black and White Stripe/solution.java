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
 
                if (len <= 0) {
                    return -1;
                }
            }
 
            return buffer[ptr++];
        }
 
        String next() throws IOException {
            StringBuilder sb = new StringBuilder();
            int c;
 
            do {
                c = read();
            } while (c <= ' ');
 
            while (c > ' ') {
                sb.append((char) c);
                c = read();
            }
 
            return sb.toString();
        }
 
        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }
 
    public static void main(String[] args) throws Exception {
 
        FastScanner sc = new FastScanner();
        StringBuilder out = new StringBuilder();
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
 
            int n = sc.nextInt();
            int k = sc.nextInt();
 
            String s = sc.next();
 
            // Count W in the first window
            int white = 0;
 
            for (int i = 0; i < k; i++) {
                if (s.charAt(i) == 'W') {
                    white++;
                }
            }
 
            int answer = white;
 
            // Sliding window
            for (int i = k; i < n; i++) {
 
                // Add the new character
                if (s.charAt(i) == 'W') {
                    white++;
                }
 
                // Remove the old character
                if (s.charAt(i - k) == 'W') {
                    white--;
                }
 
                answer = Math.min(answer, white);
            }
 
            out.append(answer).append('
');
        }
 
        System.out.print(out);
    }
}