import java.io.*;
import java.util.*;
 
public class Main {
 
    private static final int BUFFER_SIZE = 1 << 16;
    private static byte[] buffer = new byte[BUFFER_SIZE];
    private static int bufferPointer = 0, bytesRead = 0;
    private static InputStream in = System.in;
 
    private static int readByte() throws IOException {
        if (bufferPointer == bytesRead) {
            bytesRead = in.read(buffer, 0, BUFFER_SIZE);
            bufferPointer = 0;
            if (bytesRead == -1) return -1;
        }
        return buffer[bufferPointer++];
    }
 
    private static int nextInt() throws IOException {
        int ret = 0;
        int b = readByte();
        while (b < '0' || b > '9') b = readByte();
        while (b >= '0' && b <= '9') {
            ret = ret * 10 + (b - '0');
            b = readByte();
        }
        return ret;
    }
 
    private static final Random RNG = new Random(7);
 
    private static void shuffle(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int j = RNG.nextInt(i + 1);
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }
 
    public static void main(String[] args) throws IOException {
        int t = nextInt();
        StringBuilder sb = new StringBuilder();
 
        while (t-- > 0) {
            int n = nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
 
            int[] sorted = a.clone();
            shuffle(sorted);
            Arrays.sort(sorted);
 
            boolean ok = true;
            for (int i = 0; i < n; i++) {
                if ((a[i] & 1) != (sorted[i] & 1)) {
                    ok = false;
                    break;
                }
            }
            sb.append(ok ? "YES" : "NO").append('
');
        }
 
        System.out.print(sb);
    }
}