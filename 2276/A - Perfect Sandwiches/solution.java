import java.util.*;
import java.lang.Math;
 
public class Solution
{
        public static void main(String args[])
        {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                while(n-->0)
                {
                        int a = sc.nextInt();
                        int b = sc.nextInt();
                        if(b>=a) System.out.println(-1);
                        else
                        {
                              System.out.println(Math.min(b,a-b));  
                        }
                }
        }
}