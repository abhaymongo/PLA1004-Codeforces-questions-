import java.util.*;
 
public class Main {
 
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
 
        while (true) {
 
            // Simon's turn
            int g = gcd(a, n);
 
            if (g > n) {
                System.out.println(1);
                return;
            }
 
            n -= g;
 
            if (n == 0) {
                System.out.println(0);
                return;
            }
 
            // Antisimon's turn
            g = gcd(b, n);
 
            if (g > n) {
                System.out.println(0);
                return;
            }
 
            n -= g;
 
            if (n == 0) {
                System.out.println(1);
                return;
            }
        }
    }
}