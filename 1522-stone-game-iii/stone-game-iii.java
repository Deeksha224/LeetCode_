class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int[] dp = new int[stoneValue.length];
        Arrays.fill(dp,-1);
        int ans = solve(0,stoneValue,dp);
        if(ans == 0) return "Tie";
        if(ans>0) return "Alice";
        return "Bob";
        
    }
    public int solve(int i, int[] stoneValue,int[] dp){
        if (i >= stoneValue.length) return 0;
        if(dp[i] != -1) return dp[i];

        int max = Integer.MIN_VALUE;
        max = Math.max(max,stoneValue[i] - solve(i+1,stoneValue,dp));
        if(i+1 < stoneValue.length)
            max = Math.max(max,(stoneValue[i]+stoneValue[i+1]) - solve(i+2,stoneValue,dp));
        if(i+2 < stoneValue.length)
            max = Math.max(max,(stoneValue[i]+stoneValue[i+1]+stoneValue[i+2])-solve(i+3,stoneValue,dp));
        dp[i] = max;
        return dp[i];

    }
}