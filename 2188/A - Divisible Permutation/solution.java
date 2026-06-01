import java.util.*;
public class Main {
    public static void main(String[] args) {
 
 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int a = sc.nextInt();
            if (a==1) System.out.println("1");
            List<Integer> res = new ArrayList<>();
            res.add(1);
            res.add(a);
            int recent = a;
            for (int i = a - 2; i > 0; i--) {
                if (recent > a / 2) {
                    res.add(recent - i);
                    recent = recent - i;
                } else {
                    res.add(recent + i);
                    recent = recent + i;
                }
            }
            for (int j = res.size()-1; j >= 0; j--) {
                System.out.print(res.get(j) + " ");
            }
        }
    }
}