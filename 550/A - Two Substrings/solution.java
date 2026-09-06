import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String s = sc.nextLine();
 
        // Check AB ... BA
        int ab = s.indexOf("AB");
 
        if (ab != -1) {
            int ba = s.indexOf("BA", ab + 2);
 
            if (ba != -1) {
                System.out.println("YES");
                return;
            }
        }
 
        // Check BA ... AB
        int ba = s.indexOf("BA");
 
        if (ba != -1) {
            int ab2 = s.indexOf("AB", ba + 2);
 
            if (ab2 != -1) {
                System.out.println("YES");
                return;
            }
        }
 
        System.out.println("NO");
    }
}