import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();

        long S = N / 4;

        for ( int i = 0; i < S; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
        sc.close();
    }
}