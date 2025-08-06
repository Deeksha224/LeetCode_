// Last updated: 8/6/2025, 11:10:25 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0){
            return false;
        }
        while (n % 2 == 0){
            n /= 2;
        }
        return n == 1;
    }
}