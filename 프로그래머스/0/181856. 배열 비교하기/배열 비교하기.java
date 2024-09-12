class Solution {
    public int solution(int[] arr1, int[] arr2) {
        
        if (arr1.length > arr2.length) return 1;
        if (arr1.length == arr2.length) {
            int sum1 = 0;
            int sum2 = 0;
            for (int i : arr1) {
                sum1 += i;
            }
            for (int i : arr2) {
                sum2 += i;
            }
            
            if (sum1 > sum2) return 1;
            else if (sum1 == sum2) return 0;
        }
        return -1;
    }
}