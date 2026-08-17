import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            for (int i = 2; i <= n; i++) {
                sc.nextInt();
            }
 
            int m = sc.nextInt();
 
            int[] a = new int[m];
            int x = -1;
 
            for (int i = 0; i < m; i++) {
                a[i] = sc.nextInt();
 
                if (a[i] == 1)
                    x = i;
            }
 
            if (m == 1) {
                System.out.println(0);
                continue;
            }
 
            if (x == -1)
                x = 0;
 
            System.out.print(m - 1);
 
            for (int i = 0; i < m; i++) {
                if (i != x)
                    System.out.print(" " + a[i]);
            }
 
            System.out.println();
        }
    }
}