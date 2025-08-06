// Last updated: 8/6/2025, 11:04:51 AM
class Solution {
    public int minimumSum(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length-2; i++){
            for (int j = i+1; j < nums.length -1; j++){
                for (int k = j+1; k < nums.length; k++){
                    if ((nums[i] < nums[j]) && (nums[j] > nums[k])){
                        int sum = nums[i] + nums[j] + nums[k];
                        ans = Math.min(ans,sum);
                    }
                }
            }
        }
        return (ans==Integer.MAX_VALUE?-1:ans);
    }
}