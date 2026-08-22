import java.io.*;
import java.util.*;
 
public class Main {
    static class Friend {
        long m, f;
 
        Friend(long m, long f) {
            this.m = m;
            this.f = f;
        }
    }
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
 
        int n = Integer.parseInt(st.nextToken());
        long d = Long.parseLong(st.nextToken());
 
        Friend[] friends = new Friend[n];
 
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            long m = Long.parseLong(st.nextToken());
            long f = Long.parseLong(st.nextToken());
            friends[i] = new Friend(m, f);
        }
 
        Arrays.sort(friends, Comparator.comparingLong(a -> a.m));
 
        long sum = 0;
        long max = 0;
        int left = 0;
 
        for (int right = 0; right < n; right++) {
            sum += friends[right].f;
 
            while (friends[right].m - friends[left].m >= d) {
                sum -= friends[left].f;
                left++;
            }
 
            max = Math.max(max, sum);
        }
 
        System.out.println(max);
    }
}