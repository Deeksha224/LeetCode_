// Last updated: 8/6/2025, 11:10:40 AM
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        while (left < right){
            right &= right - 1;
        }
        return right;
    }
}