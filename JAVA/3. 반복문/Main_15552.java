import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main_15552 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   // BufferedReader 쓰는 법
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // BufferedWriter 쓰는 법

        int N = Integer.parseInt(br.readLine()); // 테스트케이스의 개수
        // readLine()은 한 행을 전부 읽는다. -> 문자열을 공백 단위로 분리해줘야 함

        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");   // 문자열 분리
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
            // st.nextToken()은 문자열을 반환하므로 Integer.parseInt()를 이용해 int형으로 바꿔줘야 함
        }
        br.close();

        bw.flush();
        bw.close();
    }
}
