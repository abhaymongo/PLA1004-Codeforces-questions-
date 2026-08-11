import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        
        Integer[] a = new Integer[12];
        for (int i = 0; i < 12; i++) {
            a[i] = scanner.nextInt();
        }
        
        // Sort in descending order
        Arrays.sort(a, Collections.reverseOrder());
        
        int sum = 0, count = 0;
        for (int i = 0; i < 12; i++) {
            if (sum >= k) break;
            sum += a[i];
            count++;
        }
        
        if (sum < k) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }
    }
}