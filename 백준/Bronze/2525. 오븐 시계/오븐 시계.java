import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int H = in.nextInt();
        int M = in.nextInt();
        int Cook = in.nextInt();

        int Finish = M + Cook;

        if ( Finish % 60 == 0) {
            H = H + (Finish / 60);
            M = 0;
        } else {
            H = H + (Finish / 60);
            M = Finish % 60;
        }
        if (H > 23)
            H = H - 24;

        in.close();
        System.out.printf("%d %d", H, M);
    }
}
