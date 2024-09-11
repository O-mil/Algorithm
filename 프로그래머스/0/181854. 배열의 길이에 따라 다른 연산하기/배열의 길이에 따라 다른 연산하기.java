class Solution {
    public int[] solution(int[] arr, int n) {
        
        for (int i = 0; i < arr.length; i+=2) {
            if (arr.length % 2 == 0) arr[i+1] += n;
            else arr[i] += n;
        }
        return arr;
    }
}