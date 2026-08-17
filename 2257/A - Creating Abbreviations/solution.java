import java.util.*;
 
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-->0)
        {
            boolean flag = true;
            int s = sc.nextInt();
            int n = sc.nextInt();
            List<Character> c = new ArrayList<>();
            while(s-->0)
            {
                String g = sc.next();
                c.add(g.charAt(0));
            }
 
            while(n-->0)
            {
                String ab = sc.next();
                for(int i = 0;i<ab.length();i++)
                {
                    if(!c.contains(Character.toLowerCase(ab.charAt(i))))
                    {
                        flag = false;
                        break;
                    }
                }
            }
            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }
 
 
    }
}