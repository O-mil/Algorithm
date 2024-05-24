class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] ch = s.toCharArray();
        
        answer[0] = -1;
        for (int i = 1; i < ch.length; i++) {
            for (int j = 0; j < i; j++) {
                if (ch[j] == ch[i]) {
                    answer[i] = i - j;
                }
            }
            if (answer[i] == 0) answer[i] = -1;
        }
        return answer;
    }
}