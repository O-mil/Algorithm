import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = new int[arr.length];
        int num = arr[0];
        answer[0] = arr[0];
        int cnt = 1;
        
        for (int i = 1; i < arr.length; i++) {
            if (num != arr[i]) {
                answer[cnt] = arr[i];
                num = arr[i];
                cnt++;
            }
        }
        return Arrays.copyOf(answer, cnt);
    }
}