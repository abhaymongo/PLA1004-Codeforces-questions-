import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int ans = 0;
 
        for (int i = 0; i < n; i++) {
            String s = sc.next();
 
            if (s.equals("Tetrahedron")) {
                ans += 4;
            } 
            else if (s.equals("Cube")) {
                ans += 6;
            } 
            else if (s.equals("Octahedron")) {
                ans += 8;
            } 
            else if (s.equals("Dodecahedron")) {
                ans += 12;
            } 
            else if (s.equals("Icosahedron")) {
                ans += 20;
            }
        }
 
        System.out.println(ans);
    }
}