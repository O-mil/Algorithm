import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] works = new int[progresses.length];
        int[] answer = new int[progresses.length];
        
        for (int i = 0; i < progresses.length; i++) {
            works[i] = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] != 0) works[i]++;
        }
        
        int num = works[0];
        int cnt = 1;
        int n = 0;
        for (int i = 1; i < progresses.length; i++) {
            if (works[i] <= num) cnt++;
            else {
                answer[n] = cnt;
                cnt = 1;
                n++;
                num = works[i];
            }
        }
        answer[n] = cnt;
        return Arrays.copyOf(answer, n+1);
    }
}