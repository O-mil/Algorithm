import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];
            
            int[] list = new int[end - start + 1];
            for (int j = 0; j < list.length; j++) {
                list[j] = array[start -1 + j];
            }
            Arrays.sort(list);
            answer[i] = list[k -1];
        }
        return answer;
    }
}