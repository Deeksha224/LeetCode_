// Last updated: 8/6/2025, 11:07:51 AM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            // ans[i] = (int)Math.pow(nums[i], 2);
            ans[i] = (Math.abs(nums[i])) * (Math.abs(nums[i]));
        }
        Arrays.sort(ans);
        return ans;
    }
}