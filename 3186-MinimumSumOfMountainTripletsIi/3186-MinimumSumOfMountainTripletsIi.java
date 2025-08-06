// Last updated: 8/6/2025, 11:04:50 AM
class Solution {
    public int minimumSum(int[] nums) {
        int[] leftMin = new int[nums.length];
        leftMin[0] = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            leftMin[i] = Math.min(leftMin[i - 1], nums[i - 1]);
        }
        int[] rightMin = new int[nums.length];
        rightMin[nums.length - 1] = Integer.MAX_VALUE;
        for (int i = nums.length - 2; i >= 0; i--) {
            rightMin[i] = Math.min(rightMin[i + 1], nums[i + 1]);
        }
        int result = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length - 1; i++) {
            if (rightMin[i] < nums[i] && leftMin[i] < nums[i])
                result = Math.min(result, rightMin[i] + leftMin[i] + nums[i]);
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}