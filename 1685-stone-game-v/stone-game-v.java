class Solution {
    public int stoneGameV(int[] stoneValue) {
        int[][] dp = new int[stoneValue.length][stoneValue.length];
        for(int[] d : dp){
            Arrays.fill(d,-1);
        }
        //prefix array
        int[] prefix = new int[stoneValue.length+1];
        prefix[0] = 0;
        for(int k = 0   ; k < stoneValue.length; k++){
            prefix[k+1] = prefix[k]+stoneValue[k];
        }
        return solve(0,stoneValue.length-1,stoneValue,dp,prefix);
    }
    public int solve(int i, int j,int[] stoneValue,int[][]dp,int[] prefix){
        if(i==j) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int ans = 0;

        
        for(int k = i; k < j; k++){
            //ls (i,k)   rs(k+1,j)
            int leftSum = prefix[k+1] - prefix[i];
            int rightSum = prefix[j+1] - prefix[k+1];
            if(leftSum < rightSum){
                ans = Math.max(ans, leftSum + solve(i,k,stoneValue,dp,prefix));
            }
            else if (rightSum < leftSum){
                ans = Math.max(ans, rightSum + solve(k+1,j,stoneValue,dp,prefix));
            }
            else{
                ans = Math.max(ans, Math.max(leftSum + solve(i,k,stoneValue,dp,prefix),rightSum + solve(k+1,j,stoneValue,dp,prefix)));
            }
            
            
        }
        dp[i][j] = ans;
        return dp[i][j];
    }
    // int sum(int[]stoneValue, int i, int j){
    //     int sum = 0;
    //     for(int k = i; k <= j; k++){
    //         sum+=stoneValue[k];
    //     }
    //     return sum;
    // }

}