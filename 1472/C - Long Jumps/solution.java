import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            long[] a = new long[n];
            long[] dp = new long[n];
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
 
            long answer = 0;
 
            for (int i = n - 1; i >= 0; i--) {
 
                dp[i] = a[i];
 
                long next = i + a[i];
 
                if (next < n) {
                    dp[i] += dp[(int) next];
                }
 
                answer = Math.max(answer, dp[i]);
            }
 
            System.out.println(answer);
        }
    }
}