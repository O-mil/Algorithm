import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int H = in.nextInt();
        int M = in.nextInt();

        if (M >= 45) {
            M = M - 45;
            System.out.printf("%d %d", H, M);
        } else {
            M = 60 - (45 - M);
            H--;
            if (H < 0) {
                H = 23;
            }
            System.out.printf("%d %d", H, M);
        }
        in.close();
    }
}