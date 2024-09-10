class Solution {
    public int solution(int[] num_list) {
        
        int multi = 1;
        int sum = 0;
        
        for (int i : num_list) {
            multi *= i;
            sum += i;
        }
        
        if (multi < Math.pow(sum, 2)) return 1;
        return 0;
    }
}