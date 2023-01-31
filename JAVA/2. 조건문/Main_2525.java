import java.util.Scanner;

public class Main_2525 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int H = in.nextInt();   // 현재 시
        int M = in.nextInt();   // 현재 분
        int Cook = in.nextInt();    // 오븐 시간

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
