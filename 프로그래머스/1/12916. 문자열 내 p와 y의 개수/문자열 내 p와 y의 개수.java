class Solution {
    boolean solution(String s) {
        
        s = s.toLowerCase();
        int a = 0;
        int b = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == 'p') a++;
            else if (ch == 'y') b++;
        }
        
        if (a == b) return true;
        else return false;
        
    }
}