class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int min = 0, max = 0, total = 0;
        int maxSoFar = nums[0];
        int minSoFar = nums[0];

        for (int i = 0; i < nums.length; i++){
            min = Math.min(nums[i],nums[i]+min);
            minSoFar = Math.min(minSoFar, min);

            max = Math.max(nums[i], nums[i] + max);
            maxSoFar = Math.max(maxSoFar, max);

            total+=nums[i];
        }
        if (total == minSoFar){
            return maxSoFar;
        }

        return Math.max(maxSoFar, total-minSoFar);
    }
}