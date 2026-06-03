import java.util.*;
 
public class Main
{
        public static void main(String[] args)
        {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                while(n-->0)
                {
                        int a = sc.nextInt(); 
                        int[] arr = new int[a];
                        for(int i = 0;i<a;i++)
                        {
                                arr[i] = sc.nextInt();
                        }
                        for(int j = 0;j<a;j++)
                        {
                                int b = sc.nextInt();
                                String moves = sc.nextLine();
                                for(int k = 0;k<=b;k++)
                                {
                                        if(moves.charAt(k)=='U')
                                        {
                                                if(arr[j]==0) arr[j] = 9;
                                                else arr[j]--;
                                        }
                                        
                                        else if(moves.charAt(k)=='D')
                                        {
                                                if(arr[j]==9) arr[j] = 0;
                                                else arr[j]++;
                                        }
                                }
                        }
                        
                        for(int w:arr)
                        {
                                System.out.print(w + " ");
                        }
                        System.out.println("
");
                }
        }
}