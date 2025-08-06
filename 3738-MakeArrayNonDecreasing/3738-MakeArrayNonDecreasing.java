// Last updated: 8/6/2025, 11:04:20 AM
class Solution {
    public int maximumPossibleSize(int[] nums) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] >= max){
                count++;
            }
            max = Math.max(max,nums[i]);
        }
        return count;
    }
}