import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int K = 1;
        int Q = 1;
        int R = 2;
        int B = 2;
        int Kn = 2;
        int P = 8;
        
        K = K - in.nextInt();
        Q = Q - in.nextInt();
        R = R - in.nextInt();
        B = B - in.nextInt();
        Kn = Kn - in.nextInt();
        P = P - in.nextInt();
        
        System.out.print(K + " ");
        System.out.print(Q + " ");
        System.out.print(R + " ");
        System.out.print(B + " ");
        System.out.print(Kn + " ");
        System.out.print(P + " ");
        
        in.close();
        
    }
}