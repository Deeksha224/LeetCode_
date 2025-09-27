class Solution {
    public boolean isPerfectSquare(int num) {
        double x = Math.sqrt(num);
        int y = (int)Math.round(x);
        return x == y;
    }
}