import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int[] arr = new int[3];

       int A = sc.nextInt();
       int B = sc.nextInt();

       A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
       B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());

        System.out.println(A > B ? A : B);

       sc.close();
    }
}