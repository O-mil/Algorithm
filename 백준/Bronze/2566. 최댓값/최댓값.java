import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[9][9];
        int max = 0;
        int n = 0, m = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    n = i; m = j;
                }
            }
        }
        System.out.println(max);
        System.out.println((n + 1) + " " + (m + 1));

        sc.close();
    }
}