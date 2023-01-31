import java.util.Scanner;

public class Main_1110_T {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int num = 0;
        int copy = N;

        while(true) {
            N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
            num++;

            if (copy == N) {
                break;
            }
        }
        in.close();
        System.out.println(num);
    }
}
