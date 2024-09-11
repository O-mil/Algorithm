class Solution {
    public int solution(String num_str) {
        String[] arr = num_str.split("");
        
        
        int sum = 0;
        for (String num : arr) {
            int n = Integer.parseInt(num);
            sum += n;
        }
        
        return sum;
    }
}