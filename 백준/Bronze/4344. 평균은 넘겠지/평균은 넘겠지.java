
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        double sum = 0;

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            double avg = sum / N;
            double cnt = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > avg) {
                    cnt++;
                }
            }
            System.out.printf("%.3f%%", (cnt/ N) * 100);
            System.out.println();
            sum = 0;
        }
        sc.close();
    }
}