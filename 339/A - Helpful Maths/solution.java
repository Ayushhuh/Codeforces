import java.util.Scanner;
 
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] sarr = s.split("\\+");
        int[] n = new int[sarr.length];
 
        for(int i =0;i<sarr.length;i++)
        {
            n[i] = Integer.parseInt(sarr[i]);
        }
 
        int l = 0,r=n.length-1,temp=0;
        int j=0;
        while(j<=r)
        {
            if(n[j]==1)
            {
                temp = n[l];
                n[l] = n[j];
                n[j] = temp;
                j++;
                l++;
            }
            else if(n[j]==2)
            {
                j++;
            }
            else if(n[j]==3)
            {
                temp = n[r];
                n[r] = n[j];
                n[j] = temp;
                r--;
            }
        }
 
        for(int k = 0;k<n.length;k++)
        {
            if(k!=n.length-1)
            {
                System.out.print(n[k]+"+");
            }
            else System.out.println(n[k]);
        }
    }
}