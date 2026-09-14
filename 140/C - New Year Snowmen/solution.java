import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        Map<Integer, Integer> map = new HashMap<>();
 
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
 
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> b[1] - a[1]
        );
 
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(new int[]{entry.getKey(), entry.getValue()});
        }
 
        List<int[]> ans = new ArrayList<>();
 
        while (pq.size() >= 3) {
            int[] a = pq.poll();
            int[] b = pq.poll();
            int[] c = pq.poll();
 
            int[] snowman = {a[0], b[0], c[0]};
            Arrays.sort(snowman);
 
            ans.add(new int[]{snowman[2], snowman[1], snowman[0]});
 
            if (--a[1] > 0) pq.add(a);
            if (--b[1] > 0) pq.add(b);
            if (--c[1] > 0) pq.add(c);
        }
 
        System.out.println(ans.size());
 
        for (int[] s : ans) {
            System.out.println(s[0] + " " + s[1] + " " + s[2]);
        }
    }
}