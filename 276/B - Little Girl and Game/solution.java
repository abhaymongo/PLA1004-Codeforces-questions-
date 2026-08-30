import java.io.*;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
 
        String s = br.readLine();
 
        int[] frequency = new int[26];
 
        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i) - 'a']++;
        }
 
        int odd = 0;
 
        for (int i = 0; i < 26; i++) {
            if (frequency[i] % 2 != 0) {
                odd++;
            }
        }
 
        if (odd == 0 || odd % 2 == 1) {
            System.out.println("First");
        } else {
            System.out.println("Second");
        }
    }
}