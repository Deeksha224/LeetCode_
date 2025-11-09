class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                for(int k = j + 1; k < n; k++) {
                    if(nums[i] == nums[j] && nums[j] == nums[k]) {
                        int sum = (j - i) + (k - i) + (k - j);
                        ans = Math.min(ans, sum);
                    }
                }
            }
        }
        if(ans == Integer.MAX_VALUE) return -1;
        return ans;
    }
}