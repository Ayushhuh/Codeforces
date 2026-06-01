import java.util.Scanner;
 
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int kn = Integer.MIN_VALUE;
        int c = 0;
        for(int i = 0;i<n;i++)
        {
            int a = sc.nextInt();
            if(i==k-1) kn = a;
            if(a!=0&&a>=kn)
            {
                c++;
            }
        }
 
        System.out.println(c);
    }
 
}