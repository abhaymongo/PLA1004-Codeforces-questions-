import java.io.*;
import java.util.*;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
 
        StringTokenizer st =
                new StringTokenizer(br.readLine());
 
        int n = Integer.parseInt(st.nextToken());
        long k = Long.parseLong(st.nextToken());
 
        long[] a = new long[n];
 
        st = new StringTokenizer(br.readLine());
 
        for (int i = 0; i < n; i++)
            a[i] = Long.parseLong(st.nextToken());
 
        Arrays.sort(a);
 
        int mid = n / 2;
 
        long low = a[mid];
        long high = a[mid] + k;
        long answer = a[mid];
 
        while (low <= high) {
 
            long x = low + (high - low) / 2;
 
            long required = 0;
 
            for (int i = mid; i < n; i++) {
 
                if (a[i] < x) {
                    required += x - a[i];
 
                    if (required > k)
                        break;
                }
            }
 
            if (required <= k) {
                answer = x;
                low = x + 1;
            } else {
                high = x - 1;
            }
        }
 
        System.out.println(answer);
    }
}