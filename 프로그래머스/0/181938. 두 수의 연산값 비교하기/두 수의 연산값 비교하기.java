class Solution {
    public int solution(int a, int b) {
        String answer = Integer.toString(a) + Integer.toString(b);
        
        if (Integer.parseInt(answer) >= 2*a*b) return Integer.parseInt(answer);
        
        return 2*a*b;
    }
}