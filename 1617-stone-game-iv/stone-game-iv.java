class Solution {
    public boolean winnerSquareGame(int n) {
        Boolean[] dp = new Boolean[n+1];
        return fun(n,dp);
    }
    public boolean fun (int n, Boolean[] dp){
        if(n==0) return false;
        if(dp[n] != null) return dp[n];
        for (int i = 1; i*i <=n; i++){

            // i remove i^2 , and opponent recive (n-i^2), then i again call the function if the result give me true then ik its a bad move and i have to avoid it, same if i get a false ik its a good move for me making opponent to loose the game hence no need to check further so just can return the answer.

            if(fun(n - i*i,dp)==false) { 
                return dp[n]=true;
            }
        }
        return dp[n]=false;
    }
}