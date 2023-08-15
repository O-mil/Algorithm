import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int count = 0;
        int i = 1;
        int deno = 0; int number = 0;
        
        while (count < x) {
            count += i;
            i++;
        }
        
        if ((i - 1) % 2 == 0) {
            deno = 1 + (count - x);
            number = (i - 1) - (count - x);
        }
        else {
            deno = (i - 1) - (count - x);
            number = 1 + (count - x);
        }

        System.out.println(number + "/" + deno);
        sc.close();
    }
}