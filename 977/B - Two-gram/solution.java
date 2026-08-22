import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        String s = sc.next();
 
        HashMap<String, Integer> map = new HashMap<>();
 
        String answer = "";
        int max = 0;
 
        for (int i = 0; i < n - 1; i++) {
            String pair = s.substring(i, i + 2);
 
            map.put(pair, map.getOrDefault(pair, 0) + 1);
 
            if (map.get(pair) > max) {
                max = map.get(pair);
                answer = pair;
            }
        }
 
        System.out.println(answer);
    }
}