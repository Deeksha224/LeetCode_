class Solution {
    public int minimumCost(int[] nums) {
        int count = 0;
        count = nums[0];
        Arrays.sort(nums);
        if (count == nums[0] || count == nums[1]){
            return nums[0]+nums[1]+nums[2];
        }
        return count+nums[0]+nums[1];
    }
}