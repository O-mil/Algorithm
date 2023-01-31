import java.util.Scanner;

public class Main_10807 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] arr = new int[N];

        for ( int i = 0; i < N; i++) {
            int a = in.nextInt();
            arr[i] = a;
        }

        int V = in.nextInt();
        int cnt = 0;

        for ( int j = 0; j < N; j++) {
            if ( arr[j] == V) {
                cnt++;
            }
        }
        in.close();
        System.out.println(cnt);
    }
}
