import java.io.*;
import java.util.*;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int limit = 1000000;
 
        boolean[] prime = new boolean[limit + 1];
        Arrays.fill(prime, true);
 
        prime[0] = false;
        prime[1] = false;
 
        for (int i = 2; i * i <= limit; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    prime[j] = false;
                }
            }
        }
 
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
 
        StringBuilder out = new StringBuilder();
 
        for (int i = 0; i < n; i++) {
            long x = Long.parseLong(st.nextToken());
 
            long root = (long) Math.sqrt(x);
 
            if (root * root == x && prime[(int) root]) {
                out.append("YES
");
            } else {
                out.append("NO
");
            }
        }
 
        System.out.print(out);
    }
}