class Solution {
    public int minDistance(String s1, String s2) {
        if(s1.equals(s2)) return 0;
        int[][] dp = new int[s1.length()][s2.length()];
        for(int[] d: dp){
            Arrays.fill(d,-1);
        }
        return (s1.length()+s2.length()- 2*(lcs(s1,s2,0,0,dp)));
    }
    public int lcs(String s1, String s2, int i, int j,int[][] dp){
        int ans = 0;
        if(i >= s1.length() || j >= s2.length()) return 0;

        if(dp[i][j] != -1) return dp[i][j];

        if(s1.charAt(i) == s2.charAt(j)){
            ans= 1+ lcs(s1,s2,i+1,j+1,dp);

        }
        else{
            int a = lcs(s1,s2,i+1,j,dp);
            int b = lcs(s1,s2,i,j+1,dp);
            ans = Math.max(a,b);
        }
        return dp[i][j] = ans;
    }
}