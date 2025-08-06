// Last updated: 8/6/2025, 11:12:41 AM
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        gen(n,0,0,"",res);
        return(res);
    }

    public static void gen(int n, int close, int open, String ans, List<String> res){
        if (open == n && close == n){
            res.add(ans);
            //System.out.println(ans);
            return;
        }
        if (open > n || close > open){
            return;
        }
        gen (n,close, open +1, ans+"(",res);
        gen(n,close + 1, open, ans +")",res);
    }
}