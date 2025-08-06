// Last updated: 8/6/2025, 11:05:09 AM
class Solution {
    public int maximumCount(int[] nums) {
        int pcount = 0;
        int ncount = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0){
                pcount++;
            }
            if (nums[i] < 0){
                ncount++;
            }
        }
        return (Math.max(pcount,ncount));
    }
}