class Solution {
    public boolean solution(int x) {
                
        int answer = 0;
        int num = x;
        while (num > 0) {
            answer = answer + num % 10;
            num /= 10;
        }
                
        return (x % answer == 0);
    }
}