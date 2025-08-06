// Last updated: 8/6/2025, 11:09:25 AM
class Solution {
    public int arrangeCoins(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++){
            if (n > 0){
                n -= i;
                count++;
            }
        }
        return count;
    }
}