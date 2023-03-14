import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {     // BufferedReader, readLine 쓸 떄 꼭!! "thwows IOException"을 써줘야 함.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       // BufferedReader 선언

        String str = br.readLine().trim();      // br.readline 으로 문자열 받기 (줄 단위) -> sc.nextLine()과 같음
        //trim -> 문자열 앞 뒤 공백 제거 (문자열 가운데 있는 공백은 제거 안 됨)
        int index = Integer.parseInt(br.readLine());        // readLine은 문자열로 받아서 int로 변환 시켜줘야 함. -> Integer.parseInt(br.readLIne())

        System.out.println(str.substring(index -1, index));     // substring은 문자열을 자르는 것! -> index -1 ~ index까지 자른다.
        br.close();
    }
}

/*
str = Sprout;

str.substring(4) -> 결과값: ut
//stbstring(int index)
// substring은 0부터 시작, 숫자 입력시 그 자리부터 맨 뒤의 값까지를 리턴함

str.substring(3, 5) -> 결과값: out
// substring(int beginIndex, int endIndex)
*/
