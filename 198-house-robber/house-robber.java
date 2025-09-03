// Top down approach (forward recurssion, dp table is filling in backward)
//  class Solution {
//     public int rob(int[] nums) {
//         int[] dp = new int[nums.length];
//         Arrays.fill(dp,-1);
//         return Robber(nums,0,dp);
//     }
//     public int Robber (int[] nums, int i, int[] dp){
//         if (i >= nums.length){
//             return 0;
//         }
//         if (dp[i] != -1){
//             return dp[i];
//         }
//         int rob = nums[i] + Robber(nums, i+2,dp);
//         int Dont_rob = Robber(nums, i+1, dp);
//         return dp[i] = Math.max(rob,Dont_rob);
//     }
// }

// Top down approach (backward recurssion, dp table is filling in forward)
// class Solution {
//     public int rob(int[] nums) {
//         int[] dp = new int[nums.length];
//         Arrays.fill(dp,-1);
//         return Robber(nums,nums.length-1,dp);
//     }
//     public int Robber (int[] nums, int i, int[] dp){
//         if (i <0){
//             return 0;
//         }
//         if (dp[i] != -1){
//             return dp[i];
//         }
//         int rob = nums[i] + Robber(nums, i-2,dp);
//         int Dont_rob = Robber(nums, i-1, dp);
//         return dp[i] = Math.max(rob,Dont_rob);
//     }
// }

//Bottom up approach
class Solution {
    public int rob(int[] nums) {
        return Robber(nums);
    }
    public int Robber (int[] arr){
        if (arr.length == 1){
            return arr[0];
        }
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0],arr[1]);
        for (int i = 2; i < dp.length; i++){
            int rob = arr[i] + dp[i-2];
            int Dont_rob = dp[i-1];
            dp[i] = Math.max(rob,Dont_rob);
        }
        return dp[dp.length-1];
    }
}