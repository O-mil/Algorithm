class Solution {
    public int solution(int num1, int num2) {
        
        double a = (double) num1 / (double) num2;
        a *= 1000;
        
        return (int)a;
    }
}