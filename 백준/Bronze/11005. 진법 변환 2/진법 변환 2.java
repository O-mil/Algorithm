import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        int B = sc.nextInt();

        char[] a = new char[36];
        
        for (int i = 0; i < 10; i++) {
            a[i] = (char) (i + '0');
        }
        
        for (int i = 10; i < 36; i++) {
            a[i] = (char) (i + 'A' - 10);
        }
        
        long result = 0;
        String re = "";
        
        while (N > 0) {
            result = N % B;
            N = N / B;
            re = a[(int) result] + re;
        }
        System.out.println(re);
        sc.close();
    }
}