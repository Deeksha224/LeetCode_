class Solution {
    public int minPartitions(String n) {
        int ans = 0;
        for(char ch:n.toCharArray()){
            ans = Math.max((ch-'0'),ans);
        }
        return ans;
    }
}