class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        gen(n,0,0,"",ans);
        return ans;
    }
    public void gen(int n, int open, int close, String s, List<String> ans){
        if(open == n && close == n){
            ans.add(s);
            //System.out.println(s);
        }
        if(open > n || close > open) return;
        gen(n,open+1,close,s+"(",ans);
        gen(n,open,close+1,s+")",ans);
    }
}