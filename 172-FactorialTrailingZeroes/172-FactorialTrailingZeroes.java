// Last updated: 8/6/2025, 11:10:46 AM
class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while(n>0){
            n /=5;
            count += n;
        }
        return count;
    }
}