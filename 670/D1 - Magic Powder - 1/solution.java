import java.io.*;
import java.util.*;
 
public class Main {
 
    static int n;
    static long k;
    static long[] a;
    static long[] b;
 
    static boolean canMake(long x) {
        long powderNeeded = 0;
 
        for (int i = 0; i < n; i++) {
            long required = a[i] * x;
 
            if (required > b[i]) {
                powderNeeded += required - b[i];
 
                if (powderNeeded > k)
                    return false;
            }
        }
 
        return true;
    }
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
 
        StringTokenizer st =
                new StringTokenizer(br.readLine());
 
        n = Integer.parseInt(st.nextToken());
        k = Long.parseLong(st.nextToken());
 
        a = new long[n];
        b = new long[n];
 
        st = new StringTokenizer(br.readLine());
 
        for (int i = 0; i < n; i++)
            a[i] = Long.parseLong(st.nextToken());
 
        st = new StringTokenizer(br.readLine());
 
        for (int i = 0; i < n; i++)
            b[i] = Long.parseLong(st.nextToken());
 
        long low = 0;
        long high = 2000000000L;
        long answer = 0;
 
        while (low <= high) {
 
            long mid = low + (high - low) / 2;
 
            if (canMake(mid)) {
                answer = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
 
        System.out.println(answer);
    }
}