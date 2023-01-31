import java.util.Scanner;

public class Main_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] arr = new int[N];
        int a;

        for ( int i = 0; i < N; i++) {
            a = sc.nextInt();
            arr[i] = a;
        }
        
        for ( int i = 0; i < N; i++) {
            
            if ( arr[i] < X) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
        System.out.println();
    }
}
