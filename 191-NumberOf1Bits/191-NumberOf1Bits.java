// Last updated: 8/6/2025, 11:10:42 AM
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while ( n > 0) {
            int temp = n % 2;
            if (temp % 2 != 0){
                count ++;
            }
            n = n / 2;
        }
        return count;
    }
}