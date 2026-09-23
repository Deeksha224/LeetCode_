class Solution {
    public int minOperations(int[] nums, int x) {
        int total = 0;
        for(int i = 0; i < nums.length; i++){
            total+=nums[i];
        }
        int target = total - x;
        
        if(target == 0) return nums.length;
        int left = 0;
        int sum = 0;
        int maxLen = -1;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (left <= right && sum > target) {
                sum -= nums[left++];
            }
            if (sum == target) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        return maxLen == -1 ? -1 : nums.length - maxLen;

    }
}