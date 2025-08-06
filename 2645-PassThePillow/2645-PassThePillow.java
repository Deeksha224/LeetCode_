// Last updated: 8/6/2025, 11:05:07 AM
class Solution {
    public int passThePillow(int n, int time) {
        int complete = time / (n - 1);
        int remain = time % (n - 1);
        int ans = 0;
        if (complete % 2 == 0){
            ans = remain + 1;
        }
        else {
            ans = n - remain;
        }
        return ans;
    }
}