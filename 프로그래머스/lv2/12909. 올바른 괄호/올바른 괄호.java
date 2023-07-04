class Solution {
    boolean solution(String s) {
        
        int num1 = 0;
        int num2 = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i+1).equals("(")) {
                num1++;
            } else {
                num2++;
            }
            if (num1 < num2)
                return false;
        }
        
        if (num1 == num2) return true;
        else return false;
    }
}