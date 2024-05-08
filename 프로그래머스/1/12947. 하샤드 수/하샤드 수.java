class Solution {
    public boolean solution(int x) {
                
        int answer = 0;
        int num = x;
        while (num > 0) {
            answer = answer + num % 10;
            num /= 10;
        }
                
        if (x % answer == 0) return true;
        else return false;
    }
}