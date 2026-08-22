import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int m = sc.nextInt();
 
        boolean[] a = new boolean[10];
        boolean[] b = new boolean[10];
 
        for (int i = 0; i < n; i++) {
            a[sc.nextInt()] = true;
        }
 
        for (int i = 0; i < m; i++) {
            b[sc.nextInt()] = true;
        }
 
        for (int i = 1; i <= 9; i++) {
            if (a[i] && b[i]) {
                System.out.println(i);
                return;
            }
        }
 
        int x = 0, y = 0;
 
        for (int i = 1; i <= 9; i++) {
            if (a[i]) {
                x = i;
                break;
            }
        }
 
        for (int i = 1; i <= 9; i++) {
            if (b[i]) {
                y = i;
                break;
            }
        }
 
        System.out.println(Math.min(x, y) * 10 + Math.max(x, y));
    }
}