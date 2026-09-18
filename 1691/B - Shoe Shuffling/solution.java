import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            int[] a = new int[n];
            int[] ans = new int[n];
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
 
            boolean possible = true;
 
            int i = 0;
 
            while (i < n) {
                int j = i;
 
                // Find group of equal shoe sizes
                while (j < n && a[j] == a[i]) {
                    j++;
                }
 
                // Only one shoe of this size
                if (j - i == 1) {
                    possible = false;
                    break;
                }
 
                // Rotate positions inside the group
                for (int k = i; k < j - 1; k++) {
                    ans[k] = k + 2;
                }
 
                ans[j - 1] = i + 1;
 
                i = j;
            }
 
            if (!possible) {
                System.out.println(-1);
            } else {
                for (int k = 0; k < n; k++) {
                    System.out.print(ans[k] + " ");
                }
                System.out.println();
            }
        }
    }
}