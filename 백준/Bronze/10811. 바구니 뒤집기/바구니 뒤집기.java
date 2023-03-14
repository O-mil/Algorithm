import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] N = new int[sc.nextInt()];
        for (int i = 0; i < N.length; i++) {
            N[i] = i + 1;
        }

        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;

            while (a < b) {
                int temp = N[a];
                N[a++] = N[b];
                N[b--] = temp;
            }
        }
        String ret = " ";
        for (int j = 0; j < N.length; j++) {
            ret += N[j] + " ";
        }
        System.out.println(ret.trim());
        sc.close();
    }
}