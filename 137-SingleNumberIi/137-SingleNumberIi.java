// Last updated: 8/6/2025, 11:11:10 AM
class Solution {
    public int singleNumber(int[] nums) {
        int ones = 0;
        int two = 0;
        for (int num:nums){
            ones = (ones ^ num) & ~two;
            two = (two ^ num) & ~ones;
        }
        return ones;
    }
}