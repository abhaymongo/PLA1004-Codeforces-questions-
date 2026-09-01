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
 
            String s = sc.next();
 
            ArrayList<Integer> groups = new ArrayList<>();
 
            int count = 0;
 
            for (int i = 0; i < s.length(); i++) {
 
                if (s.charAt(i) == '1') {
                    count++;
                } else {
                    if (count > 0) {
                        groups.add(count);
                        count = 0;
                    }
                }
            }
 
            if (count > 0) {
                groups.add(count);
            }
 
            groups.sort(Collections.reverseOrder());
 
            int alice = 0;
 
            for (int i = 0; i < groups.size(); i += 2) {
                alice += groups.get(i);
            }
 
            out.append(alice).append('
');
        }
 
        System.out.print(out);
    }
}