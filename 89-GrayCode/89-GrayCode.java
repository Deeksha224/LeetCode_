// Last updated: 8/6/2025, 11:11:26 AM
class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();
        int total = (int)Math.pow(2,n);
        for (int i = 0; i < total; i++){
            ans.add(i^(i>>1));
        }
        return ans;
    }
}