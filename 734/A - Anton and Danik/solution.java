import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        String games = sc.next();   // <-- FIX
 
        int anton = 0, danik = 0;
 
        for (int i = 0; i < n; i++) {
            char c = games.charAt(i);
            if (c == 'A') anton++;
            else danik++;
        }
 
        if (anton > danik)
            System.out.println("Anton");
        else if (anton < danik)
            System.out.println("Danik");
        else
            System.out.println("Friendship");
    }
}