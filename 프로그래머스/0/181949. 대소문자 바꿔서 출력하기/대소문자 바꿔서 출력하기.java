import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (Character.isUpperCase(ch))
                ch = Character.toLowerCase(ch);
            else
                ch = Character.toUpperCase(ch);
            
            str2 = str2 + ch;
        }
        System.out.println(str2);
    }
}