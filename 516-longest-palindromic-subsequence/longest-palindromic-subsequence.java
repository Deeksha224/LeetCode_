class Solution {
    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length()][s.length()];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        return lps(s,0,s.length()-1,dp);
    }
    public int lps(String s, int l, int r,int[][] dp){
        if(l>r) return 0;
        if(l==r) return 1;
        if(dp[l][r] != -1) return dp[l][r];
        int ans = 0;
        if(s.charAt(l) == s.charAt(r)){
            ans = 2 + lps(s,l+1,r-1,dp);
        }
        else{
            int a = lps(s,l+1,r,dp);
            int b = lps(s,l,r-1,dp);
            ans += Math.max(a,b);
        }
        return dp[l][r]=ans;
    }
}