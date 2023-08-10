import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        int N = sc.nextInt();
        int tmp = 1;
        int ans = 0;
        
        for (int i = str.length() -1; i >= 0; i--) {
            char c = str.charAt(i);
            
            if ('A' <= c && c <= 'Z') {
                ans += (c - 'A' + 10) * tmp;
            } else {
                ans += (c - '0') * tmp;
            }
            tmp *= N;
        }
        System.out.println(ans);
        sc.close();
    }
}