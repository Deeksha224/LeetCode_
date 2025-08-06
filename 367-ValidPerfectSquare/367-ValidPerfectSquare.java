// Last updated: 8/6/2025, 11:09:41 AM
class Solution {
    public boolean isPerfectSquare(int num) {
        double x = Math.sqrt(num);
        int y = (int)Math.round(x);
        return x == y;
    }
}