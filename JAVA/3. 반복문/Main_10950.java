import java.util.Scanner;

public class Main_10950 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        int arr[] = new int[T];   // 배열 안에 입력받은 수 넣기

        for ( int i = 0; i < T; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            arr[i] = a + b;
        }
        in.close();

        for ( int k: arr) {
            System.out.println(k);
        }
    }
}