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
                arr[i] = sc.nextInt();
            }
            int max = Integer.MIN_VALUE;
            for(int num:arr)
            {
                if(num>max)
                {
                    max = num;
                }
            }
            int count=0;
            for(int nums:arr)
            {
                if(nums==max) count++;
            }
            System.out.println(count);
        }
       
    }
}