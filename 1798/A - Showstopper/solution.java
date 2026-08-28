import java.util.*;
import java.io.*;
 
public class Showstopper {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
 
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] a = new int[n];
            int[] b = new int[n];
 
            StringTokenizer stA = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) a[i] = Integer.parseInt(stA.nextToken());
 
            StringTokenizer stB = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) b[i] = Integer.parseInt(stB.nextToken());
 
            // Put the smaller value in a[i] and larger in b[i]
            for (int i = 0; i < n; i++) {
                if (a[i] > b[i]) {
                    int tmp = a[i];
                    a[i] = b[i];
                    b[i] = tmp;
                }
            }
 
            int maxA = Arrays.stream(a).max().getAsInt();
            int maxB = Arrays.stream(b).max().getAsInt();
 
            if (a[n - 1] == maxA && b[n - 1] == maxB) {
                sb.append("YES
");
            } else {
                sb.append("NO
");
            }
        }
 
        System.out.print(sb);
    }
}