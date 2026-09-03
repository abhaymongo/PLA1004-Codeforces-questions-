import java.io.*;
 
public class Main {
 
    static final long MOD = 1000000007;
 
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
 
        int t = sc.nextInt();
        int k = sc.nextInt();
 
        int MAX = 100000;
 
        long[] dp = new long[MAX + 1];
 
        dp[0] = 1;
 
        for (int i = 1; i <= MAX; i++) {
            dp[i] = dp[i - 1];
 
            if (i >= k) {
                dp[i] += dp[i - k];
            }
 
            dp[i] %= MOD;
        }
 
        long[] prefix = new long[MAX + 1];
 
        for (int i = 1; i <= MAX; i++) {
            prefix[i] = (prefix[i - 1] + dp[i]) % MOD;
        }
 
        StringBuilder out = new StringBuilder();
 
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
 
            long ans = (prefix[b] - prefix[a - 1] + MOD) % MOD;
 
            out.append(ans).append('
');
        }
 
        System.out.print(out);
    }
}