import java.util.*;
import java.io.*;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        
        int maxLen = 1, curLen = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] >= a[i - 1]) {
                curLen++;
            } else {
                curLen = 1;
            }
            maxLen = Math.max(maxLen, curLen);
        }
        
        System.out.println(maxLen);
    }
}