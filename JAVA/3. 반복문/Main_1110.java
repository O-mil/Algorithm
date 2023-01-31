import java.util.Scanner;

public class Main_1110 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int a, b;

        int Sum = 0;
        int Sum1 = N;
        int n = N;
        int num = 0;

        if ( n <= 9) {
            a = 0;
            b = n;
        }
        else {
            a = n / 10;
            b = (n % 10) / 1;
        }

        while (true) {

            Sum = a + b;
            n = Sum;
            num++;

            a = b;
            b = (Sum % 10) / 1;
            Sum1 = 10 * a + b;

            if ( Sum1 == N) {
                break;
            }
        }
        in.close();
        System.out.println(num);
    }
}
