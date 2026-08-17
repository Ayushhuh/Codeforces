import java.util.*;
 
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arrn = new int[n];
            int[] arrm = new int[m];
            int cn = 0;
            int cm = 0;
            for(int i = 0;i<n;i++)
            {
                arrn[i] = sc.nextInt();
                if(i!=0) cn = cn + (arrn[i-1] - arrn[i] + 1);
            }
            for(int i = 0;i<m;i++)
            {
                arrm[i] = sc.nextInt();
                if(i!=0)
                {
                    cm = cm+(arrm[i-1] - arrm[i] + 1);
                }
            }
 
            cn += arrn[n-1];
            cm += arrm[m-1];
 
            if(cn>=cm) System.out.println(1);
            else System.out.println(2);
 
        }
 
    }
}