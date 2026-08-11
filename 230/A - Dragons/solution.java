import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long s = scanner.nextLong();
        int n = scanner.nextInt();
        
        int[][] dragons = new int[n][2];
        for (int i = 0; i < n; i++) {
            dragons[i][0] = scanner.nextInt(); // x
            dragons[i][1] = scanner.nextInt(); // y
        }
        
        // Sort by strength x ascending
        Arrays.sort(dragons, (a, b) -> a[0] - b[0]);
        
        boolean canWin = true;
        for (int i = 0; i < n; i++) {
            if (s > dragons[i][0]) {
                s += dragons[i][1];
            } else {
                canWin = false;
                break;
            }
        }
        
        System.out.println(canWin ? "YES" : "NO");
    }
}