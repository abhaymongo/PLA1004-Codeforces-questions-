import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            int[] a = new int[n];
            int[] b = new int[n];
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
 
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
 
            int i = n - 1;
            int j = n - 1;
            int answer = 0;
 
            while (i >= 0) {
                if (a[i] > b[j]) {
                    answer++;
                    i--;
                } else {
                    i--;
                    j--;
                }
            }
 
            System.out.println(answer);
        }
    }
}