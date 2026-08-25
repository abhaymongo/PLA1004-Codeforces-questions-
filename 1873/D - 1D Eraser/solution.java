import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
 
            int operations = 0;
            int i = 0;
 
            while (i < n) {
                if (s.charAt(i) == 'B') {
                    operations++;
                    i += k;
                } else {
                    i++;
                }
            }
 
            System.out.println(operations);
        }
    }
}