import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int a = 1;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt((str.length() - 1) - i))
                a = 1;
            else {
                a = 0;
                break;
            }
        }
        System.out.println(a);
        sc.close();
    }
}