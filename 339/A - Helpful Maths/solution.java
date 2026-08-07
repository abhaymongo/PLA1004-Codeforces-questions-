import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String s = sc.nextLine();
 
        char[] arr = s.replace("+", "").toCharArray();
 
        Arrays.sort(arr);
 
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print("+");
            }
            System.out.print(arr[i]);
        }
    }
}