import java.util.*;
 
public class Main
{
        public static void main(String args[])
    {
        boolean[] freq = new boolean[26];
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
       
        
        String s = inp.replace("{"," ").replace("}"," ").replace(" ","");
        String[] arr = s.split(",");
        int count = 0;
        if(inp.equals("{}")) System.out.println("0");
        else{
        for(int i = 0;i<arr.length;i++)
        {
            char a = arr[i].charAt(0);
            if(freq[a-'a']==false)
            {
                count++;
                freq[a-'a'] = true;
            }
        }
        System.out.println(count);
        }
    }
}