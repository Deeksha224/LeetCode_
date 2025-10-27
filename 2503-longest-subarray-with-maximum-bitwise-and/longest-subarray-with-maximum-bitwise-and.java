class Solution {
    public int longestSubarray(int[] nums) {
        int max = nums[0];
        int maxLength = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++){
            if (max == nums[i]){
                ans++;
            }
            else if (nums[i] > max){
                max = nums[i];
                ans = 1;
                maxLength = 1;
            }
            else{
                maxLength = Math.max(maxLength,ans);
                ans = 0;
            }
        }
        return (Math.max(maxLength,ans));
    }
}