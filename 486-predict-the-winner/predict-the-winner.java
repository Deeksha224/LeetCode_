class Solution {
    public boolean predictTheWinner(int[] nums) {
        int[][] dp = new int[nums.length][nums.length];
        for(int[]d:dp){
            Arrays.fill(d,-1);
        }
        int ans1 = solve(0,nums.length-1, nums,dp);
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum+=nums[i];
        }
        int ans2 = sum - ans1;
        if(ans1>=ans2) return true;
        return false; 
        
    }
    public int solve(int i, int j, int[] nums,int[][]dp){
        if(i>j) return 0;
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int takei = nums[i] + Math.min(solve(i+2,j,nums,dp) , solve(i+1,j-1,nums,dp));
        int takej = nums[j]+ Math.min(solve(i+1,j-1,nums,dp) , solve(i,j-2,nums,dp));

        dp[i][j] = Math.max(takei,takej);
        return dp[i][j];


    }
}