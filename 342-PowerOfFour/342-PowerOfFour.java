// Last updated: 8/6/2025, 11:09:51 AM
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0 ){
            return false;
        }
        while (n > 1){
            if (n % 4 != 0){
                return false;
            }
            n /= 4;
        }
        return true;
    }
}