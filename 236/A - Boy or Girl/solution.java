import java.util.*;
 
public class Main
{
        public static void main(String[] args)
        {
                int[] f = new int[26];
                Scanner sc = new Scanner(System.in);
                String inp = sc.next();
                int c = 0;
                for(int i = 0;i<inp.length();i++)
                {
                        char a = inp.charAt(i);
                        int val = f[a-'a'];
                        if(val==0)
                        {
                                c++;
                                f[a-'a']++;
                        }
                }
                
                if((c%2)!=0) System.out.println("IGNORE HIM!");
                else System.out.println("CHAT WITH HER!");
        }
}