class Solution {
    public int[] solution(String myString) {
        String[] string = myString.split("x", -1);
        
        int[] answer = new int[string.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = string[i].length();
        }
        return answer;
    }
}