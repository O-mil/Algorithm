import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        List<Integer> answer = new ArrayList<>();
        
        for (int a : arr) answer.add(a);
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) answer.remove(Integer.valueOf(arr[i]));
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}