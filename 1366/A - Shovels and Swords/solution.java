import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
 
            long ans = Math.min(Math.min(a, b), (a + b) / 3);
 
            System.out.println(ans);
        }
 
        sc.close();
    }
}