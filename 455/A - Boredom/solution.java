import java.io.*;
import java.util.*;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int n = Integer.parseInt(br.readLine());
 
        StringTokenizer st = new StringTokenizer(br.readLine());
 
        long[] cnt = new long[100001];
 
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            cnt[x]++;
        }
 
        long[] dp = new long[100001];
 
        dp[1] = cnt[1];
 
        for (int i = 2; i <= 100000; i++) {
            dp[i] = Math.max(
                dp[i - 1],
                dp[i - 2] + (long) i * cnt[i]
            );
        }
 
        System.out.println(dp[100000]);
    }
}