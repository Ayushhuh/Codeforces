import java.util.*;
 
public class Main{
    static int blockstotal(String s) {
        int blocks = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                blocks++;
            }
        }
        return blocks;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
 
            int ans = 0;
 
            for (int i = 0; i < n; i++) {
                String rotated = s.substring(i) + s.substring(0, i);
                ans = Math.max(ans, blockstotal(rotated));
            }
 
            System.out.println(ans);
        }
    }
}