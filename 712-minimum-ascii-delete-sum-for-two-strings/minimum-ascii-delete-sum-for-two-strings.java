class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int[][] dp = new int[s1.length()][s2.length()];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        int cal1 = cal(s1);
        int cal2 = cal(s2);
        int cal3 = lcs(s1,s2,0,0,dp);
        return cal1+cal2-2*(cal3);
        
    }
    public int lcs(String s1, String s2, int i, int j,int[][] dp){
        if(i>=s1.length()||j>=s2.length()) return 0;
        int ans = 0;
        if(dp[i][j] != -1) return dp[i][j];
        if(s1.charAt(i) == s2.charAt(j)){
            ans = (int)(s1.charAt(i))+lcs(s1,s2,i+1,j+1,dp);
        }
        else{
            int a = lcs(s1,s2,i+1,j,dp);
            int b = lcs(s1,s2,i,j+1,dp);
            ans = Math.max(a,b);
        }
        return dp[i][j] =  ans;
    }
    public int cal(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            count += (int)s.charAt(i);
            System.out.println((int)s.charAt(i));
        }
        return count;
    }
}