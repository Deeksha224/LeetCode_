// Last updated: 8/6/2025, 11:07:07 AM
class Solution {
    public int[] runningSum(int[] arr) {
        int[] sum = new int[arr.length];
        sum[0] = arr[0];
        for (int i = 1; i < arr.length ; i++){
         arr[i] = arr[i] + arr[i-1];
         sum[i] = arr[i];
        }
    return (sum);
    }
}