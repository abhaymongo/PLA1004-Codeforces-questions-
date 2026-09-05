import java.io.*;
import java.util.*;
 
public class Main {
 
    static boolean canKill(long x, long h, long[] a) {
        long damage = x;
 
        for (int i = 0; i < a.length - 1; i++) {
            damage += Math.min(x, a[i + 1] - a[i]);
 
            if (damage >= h)
                return true;
        }
 
        return damage >= h;
    }
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
 
        int t = Integer.parseInt(br.readLine());
 
        StringBuilder out = new StringBuilder();
 
        while (t-- > 0) {
 
            StringTokenizer st =
                    new StringTokenizer(br.readLine());
 
            int n = Integer.parseInt(st.nextToken());
            long h = Long.parseLong(st.nextToken());
 
            long[] a = new long[n];
 
            st = new StringTokenizer(br.readLine());
 
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
            }
 
            long low = 1;
            long high = h;
            long answer = h;
 
            while (low <= high) {
 
                long mid = low + (high - low) / 2;
 
                if (canKill(mid, h, a)) {
                    answer = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
 
            out.append(answer).append('
');
        }
 
        System.out.print(out);
    }
}