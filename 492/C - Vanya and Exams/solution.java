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
 
        long nextLong() throws IOException {
            int c;
 
            do {
                c = read();
            } while (c <= ' ');
 
            long num = 0;
 
            while (c > ' ') {
                num = num * 10 + (c - '0');
                c = read();
            }
 
            return num;
        }
 
        int nextInt() throws IOException {
            return (int) nextLong();
        }
    }
 
    static class Exam {
        long a;
        long b;
 
        Exam(long a, long b) {
            this.a = a;
            this.b = b;
        }
    }
 
    public static void main(String[] args) throws Exception {
 
        FastScanner fs = new FastScanner();
 
        int n = fs.nextInt();
        long r = fs.nextLong();
        long avg = fs.nextLong();
 
        Exam[] exams = new Exam[n];
 
        long total = 0;
 
        for (int i = 0; i < n; i++) {
            long a = fs.nextLong();
            long b = fs.nextLong();
 
            exams[i] = new Exam(a, b);
            total += a;
        }
 
        long required = avg * n - total;
 
        if (required <= 0) {
            System.out.println(0);
            return;
        }
 
        // Sort by essays required for increasing one mark
        Arrays.sort(exams, new Comparator<Exam>() {
            @Override
            public int compare(Exam x, Exam y) {
                return Long.compare(x.b, y.b);
            }
        });
 
        long answer = 0;
 
        for (int i = 0; i < n && required > 0; i++) {
 
            long canIncrease = r - exams[i].a;
 
            long increase = Math.min(required, canIncrease);
 
            answer += increase * exams[i].b;
 
            required -= increase;
        }
 
        System.out.println(answer);
    }
}