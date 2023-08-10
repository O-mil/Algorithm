import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int change = sc.nextInt();
            
            int quarter = change / 25;
            change %= 25;
            
            int dime = change / 10;
            change %= 10;
            
            int nickel = change / 5;
            change %= 5;
            
            int penny = change;

            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
        sc.close();
    }
}