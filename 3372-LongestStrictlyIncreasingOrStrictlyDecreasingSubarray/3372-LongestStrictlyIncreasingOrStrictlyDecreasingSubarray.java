// Last updated: 8/6/2025, 11:04:42 AM
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc = 1;
        int dec = 1;
        int ans = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                inc++;
                ans = Math.max(ans, inc); 
                dec = 1;
            } 
            else if (nums[i] > nums[i + 1]) {
                dec++;
                ans = Math.max(ans, dec); 
                inc = 1;
            } 
            else {
                ans = Math.max(ans, Math.max(inc, dec)); 
                inc = 1;
                dec = 1;
            }
        }
        return ans;
    }
}
