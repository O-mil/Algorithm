import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        // HashMap 생성 (Key는 String, Value는 Integer)
        HashMap<String, Integer> map = new HashMap<>();
        
        // HashMap에 참가자 추가
        for (String player: participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        
        // HashMap에서 완주자 삭제
        for (String player: completion) {
            map.put(player, map.get(player) - 1);
        }
        
        // Value가 0이 아닌 참가자 구하기
        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
        
        while (iter.hasNext()) {
            Map.Entry<String, Integer> entry = iter.next();
            if (entry.getValue() != 0) {
                answer = entry.getKey();
                break;
            }
        }
        return answer;
        
    }
}