class Solution {
    public int longestSubarray(int[] nums) {
        int target = max(nums);
        int count = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target){
                count++;
                temp = Math.max(temp,count);
            }
            else{
                count = 0;
            }
        }
        return temp;
    }
    public int max(int[] nums){
        int m = Integer.MIN_VALUE;
        for (int n: nums){
            m = Math.max(m,n);
        }
        return m;
    }
}