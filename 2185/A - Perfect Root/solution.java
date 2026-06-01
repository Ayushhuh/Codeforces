import java.util.*;
 
public class Main
{
        public static void main(String[] args)
        {
                int min = 1;
                int max = 999999999;
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                Set<Integer> set = new HashSet<>();
                for(int i = 0;i<n;i++)
                {
                        int a = sc.nextInt();
                        int j = 0;
                        while(j<a)
                        {
                                int rndnum = (int)(Math.random() * (max - min + 1) + min);
                                if(set.add(rndnum))
                                {
                                        System.out.print(rndnum + " ");
                                        j++;
                                }
                                
                        }
                }
                
        }
}