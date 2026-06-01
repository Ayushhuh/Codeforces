import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0)
        {
            int a = sc.nextInt();
            int[] arr = new int[a];
            for (int i = 0; i < a; i++) {
                arr[i]  = sc.nextInt();
            }
            int i = 0;
           while(i+1<a&&arr[i]<=arr[i+1])
           {
               i++;
           }
           if(i==a-1) System.out.println(a);
           else System.out.println(1);
        }
 
    }
}