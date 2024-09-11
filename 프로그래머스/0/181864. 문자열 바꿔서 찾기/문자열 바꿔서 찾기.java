class Solution {
    public int solution(String myString, String pat) {
        
        myString = myString.replace('A', 'X').replace('B', 'A').replace('X', 'B');
        
        if (myString.contains(pat)) return 1;
        
        return 0;
    }
}