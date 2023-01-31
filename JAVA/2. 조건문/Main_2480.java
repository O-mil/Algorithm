import java.util.Scanner;

public class Main_2480 {
    public static void main(String[] arts) {
        Scanner in = new Scanner(System.in);

        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int a3 = in.nextInt();

        int answer = 0;
        int max = 0;

        if ( a1 == a2 && a1 == a3) {
            answer = 10000 + a1 * 1000;
        } else if (a1 == a2 || a2 == a3 || a1 == a3) {
            if ( a1 == a2 || a1 == a3) {
                answer = 1000 + a1 * 100;
            } else if (a2 == a3) {
                answer = 1000 + a2 * 100;
            }
        } else {
            if ( a1 > a2) {
                max = a1;
            } else {
                max = a2;
            }
            if ( max < a3) {
                max = a3;
            }
            answer = max * 100;
        }
        in.close();
        System.out.print(answer);
    }
}