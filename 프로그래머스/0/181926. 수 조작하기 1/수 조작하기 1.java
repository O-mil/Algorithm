class Solution {
    public int solution(int n, String control) {
        
        char[] arr = control.toCharArray();
        
        for (char str: arr) {
            if (str == 'w') n += 1;
            else if (str == 's') n -= 1;
            else if (str == 'd') n += 10;
            else n -= 10;
        }
        return n;
    }
}