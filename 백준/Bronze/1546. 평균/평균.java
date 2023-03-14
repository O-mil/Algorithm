import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        double[] arr = new double[N];

        double max = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if ( arr[i] > max) {
                max = arr[i];
            }
        }

        double cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] / max * 100;
            cnt += arr[i];
        }
        cnt /= N;
        System.out.println(cnt);
        sc.close();
    }
}