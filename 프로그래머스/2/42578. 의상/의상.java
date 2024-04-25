import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String[] cloth: clothes) {
            String type = cloth[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }
        
        Iterator<Integer> iterKey = map.values().iterator();
        
        int answer = 1;
        while(iterKey.hasNext()) {
            answer *= iterKey.next() + 1;
        }
        
        return answer -1;
    }
}