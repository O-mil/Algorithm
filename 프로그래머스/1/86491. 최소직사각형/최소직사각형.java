class Solution {
    public int solution(int[][] sizes) {
        
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > sizes[i][1]) {
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }
        
        int a = 0;
        int b = 0;
        for (int i = 0; i < sizes.length; i++) {
            
            if (a < sizes[i][0]) {
                a = sizes[i][0];
            }
            
            if (b < sizes[i][1]) {
                b = sizes[i][1];
            }
        }
        return a*b;
    }
}