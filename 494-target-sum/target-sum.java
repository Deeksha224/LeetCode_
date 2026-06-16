class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return fun(nums, 0, 0, target);
    }
    private int fun(int[] nums, int idx, int sum, int target) {
        if (idx == nums.length) {
            return sum == target ? 1 : 0;
        }

        int add = fun(nums, idx + 1, sum + nums[idx], target);
        int sub = fun(nums, idx + 1, sum - nums[idx], target);

        return add + sub;
    }
}