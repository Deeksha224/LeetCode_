class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,-2);
        return solve(coins,amount,dp);
    }
    public int solve(int[] coins, int amount, int[] dp){
        if (amount < 0) return -1;
        if (amount == 0) return 0;
        if (dp[amount] != -2) return dp[amount];

        int min = Integer.MAX_VALUE;
        for (int coin: coins){
            int ans = solve(coins, amount-coin,dp);
            if (ans >= 0 && ans < min){
                min = 1+ans;
            }
        }
        return dp[amount] = (min == Integer.MAX_VALUE)?-1:min;
    }
    
}