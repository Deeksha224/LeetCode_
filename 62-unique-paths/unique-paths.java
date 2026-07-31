class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        return count(m-1,n-1, dp);
    }
    int count (int row, int col, int[][] dp){
        if(row == 0|| col == 0) return 1;

        if(dp[row][col] != 0){
            return dp[row][col];
        }
        dp[row][col] = count(row-1,col,dp)+ count(row,col-1,dp);
        return dp[row][col];
    }
}