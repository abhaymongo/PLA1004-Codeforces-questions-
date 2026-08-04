import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            if (k == n - 1) {
                out.append("-1
");
            } else {
                int c1 = (n + 1) / 2;
                int c0 = n / 2;
                int b = n - k;
                
                int rem1 = c1 - (b + 1) / 2;
                int rem0 = c0 - b / 2;
                
                for (int i = 0; i < b; i++) {
                    int count = 1;
                    if (i == 0) {
                        count += rem1;
                    } else if (i == 1) {
                        count += rem0;
                    }
                    
                    char ch = (i % 2 == 0) ? '1' : '0';
                    for (int j = 0; j < count; j++) {
                        out.append(ch);
                    }
                }
                out.append("
");
            }
        }
        
        System.out.print(out);
        sc.close();
    }
}