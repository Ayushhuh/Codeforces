import java.util.Scanner;
 
public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int c = 0;
        for(int i = 0;i<n;i++)
        {
            int a = sc.nextInt();
            if(a>h) c+=2;
            else c++;
        }
        System.out.println(c);
    }
}