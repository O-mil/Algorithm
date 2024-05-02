import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
      
        List<Integer> answer = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            if ((100 - progresses[i]) % speeds[i] == 0) {
                queue.offer((100 - progresses[i]) / speeds[i]);
            } else {
                queue.offer ((100 - progresses[i]) / speeds[i] + 1);
            }
        }
        
        while(!queue.isEmpty()) {
            int days = queue.poll();
            int count = 1;
            
            while(!queue.isEmpty() && days >= queue.peek()) {
                queue.poll();
                count++;
            }
            answer.add(count);
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}