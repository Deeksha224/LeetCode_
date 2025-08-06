// Last updated: 8/6/2025, 11:12:15 AM
class Solution {
    public int divide(int dividend, int divisor) {
        int ans = dividend / divisor;
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
        return Integer.MAX_VALUE;
        }
        if (ans > Math.pow(2, 31) - 1){
            return (int)Math.pow(2, 31) - 1;
        }
        else if (ans < Math.pow(-2, 31)){
            return (int)Math.pow(-2, 31);
        }
        return ans;
    }
}