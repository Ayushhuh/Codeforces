import java.util.*;
 
public class Main
{
        public static void main(String[] args)
        {
                Scanner sc = new Scanner(System.in);
                int level = sc.nextInt();
                int p = sc.nextInt();
                Set<Integer> set = new HashSet<>();
                while(p-->0)
                {
                        int a = sc.nextInt();
                        set.add(a);
                }
                int q = sc.nextInt();
                int flag = 1;
                while(q-->0)
                {
                        int b = sc.nextInt();
                        set.add(b);
                }
                for(int i = level;i>0;i--)
                {
                        if(!set.contains(i)) 
                        {System.out.println("Oh, my keyboard!");
                        flag = 0;
                        break;}
                }
                
                if(flag==1)
                {
                        System.out.println("I become the guy.");
                }
                
        }
}