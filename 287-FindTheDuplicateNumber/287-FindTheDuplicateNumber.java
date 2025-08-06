// Last updated: 8/6/2025, 11:09:55 AM
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for ( int i = 1; i < nums.length; i++){
            if (nums[i] == nums[i - 1]){
                return nums[i];
            }
        }
        return nums[0];
    }
}