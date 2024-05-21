class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        answer[0] = func(n, m);
        answer[1] = (n*m) / answer[0];
        
        return answer;
    }
    
    public static int func(int a, int b) {
        if (b == 0) return a;
        return func(b, a%b);
    }
}