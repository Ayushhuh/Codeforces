import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
 
        for (int i = 0; i < num; i++) {
            String gt = sc.next();
 
            if (gt.length() > 10) {
                System.out.println(
                    "" + gt.charAt(0) + (gt.length() - 2) + gt.charAt(gt.length() - 1)
                );
            } else {
                System.out.println(gt);
            }
        }
    }
}