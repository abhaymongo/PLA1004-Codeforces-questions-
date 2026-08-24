import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            String keyboard = sc.next();
            String word = sc.next();
 
            int[] position = new int[26];
 
            for (int i = 0; i < 26; i++) {
                position[keyboard.charAt(i) - 'a'] = i;
            }
 
            int time = 0;
 
            for (int i = 1; i < word.length(); i++) {
                int current = position[word.charAt(i) - 'a'];
                int previous = position[word.charAt(i - 1) - 'a'];
 
                time += Math.abs(current - previous);
            }
 
            System.out.println(time);
        }
    }
}