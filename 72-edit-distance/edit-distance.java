class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()][word2.length()];
        return Min_Ops(word1, word2,0,0,dp);

    }
    public static int Min_Ops(String s, String t, int i, int j, int[][] dp){
        if (i == s.length()){
            return t.length() - j;
        }
        if (j == t.length()){
            return s.length() - i;
        }
        if (dp[i][j] != 0){
            return dp[i][j];
        }

        int ans = 0;
        if (s.charAt(i) == t.charAt(j)){
           ans = Min_Ops(s,t,i+1,j+1,dp);
        }
        else{
            int I =  Min_Ops(s,t,i,j+1,dp);
            int D =  Min_Ops(s,t,i+1,j,dp);
            int R =  Min_Ops(s,t,i+1,j+1,dp);
            ans = Math.min(I,Math.min(D,R)) + 1;
        }
        return dp[i][j] = ans;
    }
}