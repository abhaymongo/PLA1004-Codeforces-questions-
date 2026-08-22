import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String a = sc.next();
        String b = sc.next();
 
        StringBuilder result = new StringBuilder();
 
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) {
                result.append('0');
            } else {
                result.append('1');
            }
        }
 
        System.out.println(result);
    }
}