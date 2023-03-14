import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().trim();
        int index = Integer.parseInt(br.readLine());

        System.out.println(str.substring(index -1, index));
        br.close();
    }
}