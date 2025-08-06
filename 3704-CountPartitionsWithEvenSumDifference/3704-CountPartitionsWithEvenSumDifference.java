// Last updated: 8/6/2025, 11:04:24 AM
class Solution {
    public int countPartitions(int[] nums) {
        int count = 0;
       for (int i = 0; i<nums.length -1; i++){
           int ans1 = fun(nums, 0, i);
           int ans2 = fun(nums, i+1, nums.length - 1);
           int dif = ans1 - ans2;
           if (dif % 2 == 0){
               count++;
           }
       } 
        return count;
    }
    public static int fun (int[] arr, int start, int end){
        int sum = 0;
        for (int i = start; i <= end; i++){
            sum += arr[i];
        }
        return sum;
    }
}