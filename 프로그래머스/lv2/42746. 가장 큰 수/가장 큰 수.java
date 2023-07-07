import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        //문자열을 리턴해줄 스트링배열 생성
        String[] arr = new String[numbers.length];
        
        //int 배열을 string 배열로 변환
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
        
        //내림차순 정렬
        //오름차순 정렬: (o1 + o2).compareTo(o1+o2);
        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        
        // 0값이 중복일 경우 ex) {0, 0, 0}
        // 답이 000이 나오면 0을 리턴
        if (arr[0].equals("0")) return "0";
        
        // 0이 아니면 문자열을 더해준다.
        for (String s: arr) {
            answer += s;
        }
        return answer;
    }
}