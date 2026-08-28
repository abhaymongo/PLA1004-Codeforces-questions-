import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            int[] a = new int[n];
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
 
            boolean[] occupied = new boolean[n + 1];
            boolean possible = true;
 
            occupied[a[0]] = true;
 
            for (int i = 1; i < n; i++) {
                int seat = a[i];
 
                boolean left = seat > 1 && occupied[seat - 1];
                boolean right = seat < n && occupied[seat + 1];
 
                if (!left && !right) {
                    possible = false;
                    break;
                }
 
                occupied[seat] = true;
            }
 
            System.out.println(possible ? "YES" : "NO");
        }
    }
}