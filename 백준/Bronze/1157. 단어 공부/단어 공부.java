
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) <= 90) {      // 대문자일 경우
                arr[str.charAt(i) - 65]++;
            } else {
                arr[str.charAt(i) - 97]++;  // 소문자일 경우
            }
        }

        int max = 0;
        char ch = '?';

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);
            } else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
        sc.close();
    }
}