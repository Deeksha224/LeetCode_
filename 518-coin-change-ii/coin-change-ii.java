class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length+1][amount+1];
        for(int i=0 ; i <dp.length ; i++) dp[i][0] = 1;

        // here i is coins index
        for(int i=1 ; i<dp.length ; i++){
            for(int am=1 ; am<dp[0].length ; am++){
                int inc=0,exc=0;
                if(am>=coins[i-1]){
                    // removed last coin for that dp
                    inc = dp[i][am-coins[i-1]];
                }
                exc = dp[i-1][am];
                dp[i][am] = inc + exc;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}