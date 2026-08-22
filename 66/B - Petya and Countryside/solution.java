import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int[] a = new int[n];
 
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
 
        int ans = 1;
 
        for (int i = 0; i < n; i++) {
            int count = 1;
 
            // Move left
            int j = i;
            while (j > 0 && a[j - 1] <= a[j]) {
                count++;
                j--;
            }
 
            // Move right
            j = i;
            while (j < n - 1 && a[j + 1] <= a[j]) {
                count++;
                j++;
            }
 
            ans = Math.max(ans, count);
        }
 
        System.out.println(ans);
    }
}