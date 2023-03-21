import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int begin = Integer.parseInt(st2.nextToken());
            int end = Integer.parseInt(st2.nextToken());
            int mid = Integer.parseInt(st2.nextToken());

            for (int j = begin; j < mid; j++) {
                int temp = arr[begin - 1];
                for (int k = begin; k < end; k++) {
                    int idx = k - 1;
                    arr[idx] = arr[idx + 1];
                }
                arr[end - 1] = temp;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}