// Last updated: 8/6/2025, 11:04:19 AM
class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int dif = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length-1; i++){
            int temp = Math.abs(nums[i] - nums[i+1]);
            dif = Math.max(dif,temp);
        }
        int temp = Math.abs(nums[0] - nums[nums.length-1]);
        dif = Math.max(dif,temp);
        return dif;
    }
}