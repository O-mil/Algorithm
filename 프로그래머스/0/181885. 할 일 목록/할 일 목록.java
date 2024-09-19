class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        
        int cnt = 0;
        for (boolean b : finished) {
            if (!b) cnt++;
        }
        
        String[] answer = new String[cnt];
        int n = 0;
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                answer[n] = todo_list[i];
                n++;
            }
                  
        }
        return answer;
    }
}