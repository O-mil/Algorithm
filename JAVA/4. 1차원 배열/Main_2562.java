import java.util.Scanner;

public class Main_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            a = sc.nextInt();
            arr[i] = a;
        }

        int max = arr[0];
        int temp = 1;

        for ( int i = 1; i < 9; i++) {
            if ( arr[i] > max) {
                max = arr[i];
                temp = i + 1;
            }
        }
        sc.close();
        System.out.println(max);
        System.out.println(temp);

    }
}
