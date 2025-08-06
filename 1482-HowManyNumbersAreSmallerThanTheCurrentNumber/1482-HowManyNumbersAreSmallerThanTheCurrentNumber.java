// Last updated: 8/6/2025, 11:07:26 AM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int [nums.length];
        int num = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
               if (j != i){
                if (nums[j] < nums[i])
                num++;
            }
            }
            count[i] = num;
            num = 0;
        }
        return count;
    }
}