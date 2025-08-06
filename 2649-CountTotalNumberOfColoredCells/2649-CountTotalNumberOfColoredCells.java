// Last updated: 8/6/2025, 11:05:06 AM
class Solution {
    public long coloredCells(int n) {
        long n1 = n;
        return (n1*n1) + ((n1-1)*(n1-1));
    }
}