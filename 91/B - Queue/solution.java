import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] ans = new int[n];
 
        StringTokenizer st = new StringTokenizer(br.readLine());
 
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
 
        // Values and positions of useful candidates
        int[] values = new int[n];
        int[] positions = new int[n];
        int size = 0;
 
        // Process from right to left
        for (int i = n - 1; i >= 0; i--) {
 
            // No younger walrus exists
            if (size == 0 || values[size - 1] >= a[i]) {
                values[size] = a[i];
                positions[size] = i;
                size++;
                ans[i] = -1;
            } else {
                // Find the furthest position having value < a[i]
                int left = 0;
                int right = size - 1;
                int pos = -1;
 
                while (left <= right) {
                    int mid = (left + right) / 2;
 
                    if (values[mid] < a[i]) {
                        pos = mid;
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
 
                ans[i] = positions[pos] - i - 1;
            }
        }
 
        StringBuilder out = new StringBuilder();
 
        for (int i = 0; i < n; i++) {
            if (i > 0) out.append(" ");
            out.append(ans[i]);
        }
 
        System.out.println(out);
    }
}