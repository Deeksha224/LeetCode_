// Last updated: 8/6/2025, 11:08:44 AM
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int a = nums[0] * nums[1] * nums[nums.length - 1];
        int b = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        int ans = Math.max(a,b);
        return ans;
    }
}