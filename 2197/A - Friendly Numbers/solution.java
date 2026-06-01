import java.util.*;
 
public class Main
{
        static int sumdig(long n)
        {
                int sum = 0;
                while(n>0)
                {
                        sum+=n%10;
                        n/=10;
                }
                return sum;
        }
        public static void main(String[] args)
        {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                
                while(n-->0)
                {
                        long x = sc.nextLong();
                        int c = 0;
                        for(long y = x;y<=x+200;y++)
                        {
                                if(y-sumdig(y)==x) c++;
                        }
                        System.out.println(c);
                }
        }
}