class Solution {
    public int numDistinct(String s, String t) {
        int[][] dp = new int[s.length()+1][t.length()+1];
        for(int[] a : dp){
            Arrays.fill(a,-1);
        }
        return fun(s,t,0,0,dp);

    }
    public int fun(String s, String t, int i, int j,int[][] dp){
        if(j==t.length()) return 1;
        if(i>=s.length()) return 0;

        int inc = 0;
        int exc = 0;
        if(dp[i][j] != -1) return dp[i][j];
        if(s.charAt(i) == t.charAt(j)){
            inc += fun(s,t,i+1,j+1,dp);
        }
        exc += fun(s,t,i+1,j,dp);
        return dp[i][j] = inc+exc;
    }
}