import java.util.Scanner;

public class Main_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for ( int i = 0; i < N; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }

        int max = arr[0];
        int min = arr[0];

        for ( int i = 1; i < N; i++) {
            
            if(arr[i] > max) {
                max = arr[i];
            }

            if ( arr[i] < min) {
                min = arr[i];
            }
        }
        sc.close();
        System.out.printf("%d %d\n", min, max);
    }
}
