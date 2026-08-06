class Solution {
    public boolean winnerSquareGame(int n) {
        Boolean[] dp = new Boolean[n+1];
        return fun(n,dp);
    }
    public boolean fun(int n, Boolean[] dp){
        if(n==0) return false;
        if(dp[n] != null) return dp[n];
        for (int i = 1; i*i <= n; i++){
            if(fun(n-i*i,dp) == false){
                return dp[n] = true;
            }
        }
        return dp[n]=false;
    }
}