import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            String s1 = sc.next();
            String s2 = sc.next();
 
            boolean possible = true;
 
            for (int i = 0; i < n; i++) {
                if (s1.charAt(i) == '1' && s2.charAt(i) == '1') {
                    possible = false;
                    break;
                }
            }
 
            System.out.println(possible ? "YES" : "NO");
        }
    }
}