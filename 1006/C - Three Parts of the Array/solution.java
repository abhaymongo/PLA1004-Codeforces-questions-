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
 
        int n = sc.nextInt();
 
        long[] a = new long[n];
 
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
 
        int left = 0;
        int right = n - 1;
 
        long leftSum = a[left];
        long rightSum = a[right];
 
        long answer = 0;
 
        while (left < right) {
 
            if (leftSum == rightSum) {
                answer = Math.max(answer, leftSum);
            }
 
            if (leftSum < rightSum) {
                left++;
                leftSum += a[left];
            } else {
                right--;
                rightSum += a[right];
            }
        }
 
        System.out.println(answer);
    }
}