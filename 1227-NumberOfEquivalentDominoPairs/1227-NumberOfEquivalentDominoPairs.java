// Last updated: 8/6/2025, 11:07:46 AM
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] num = new int[100];
        int ans = 0;
        int val = 0;
        for (int[] dom : dominoes){
            if (dom[0] > dom[1]){
                val = dom[0] * 10 + dom[1];
            }
            else{
                val = dom[1] * 10 + dom[0];
            }
            ans += num[val];
            num[val]++;
        }
        return ans;
    }
}