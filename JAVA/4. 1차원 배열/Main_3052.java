import java.util.Scanner;

public class Main_3052 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int cnt = 0;

        for ( int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            arr[i] = a % 42;
        }

        for ( int i = 0; i < 10; i++) {
            for ( int j = 0; j < 10; j++) {
                if ( arr[i] == arr[j]) {
                    cnt++;
                }
            }
        }
        sc.close();
        System.out.println(cnt);
    }
}
