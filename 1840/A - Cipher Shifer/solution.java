import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
 
            StringBuilder ans = new StringBuilder();
 
            int i = 0;
 
            while (i < n) {
                ans.append(s.charAt(i));
 
                int j = i + 1;
 
                while (j < n && s.charAt(j) != s.charAt(i)) {
                    j++;
                }
 
                i = j + 1;
            }
 
            System.out.println(ans);
        }
    }
}