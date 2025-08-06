// Last updated: 8/6/2025, 11:04:43 AM
class Solution {
    public String triangleType(int[] nums) {
        if (nums[0] + nums[1] > nums[2] && nums[0] + nums[2] > nums[1] && nums[1] + nums[2] > nums[0]){
            if (nums[0] == nums[1] && nums[0] == nums[2]){
                return "equilateral";
            }
            else if (nums[0] == nums[1] || nums[0] == nums[2] || nums[1] == nums[2]){
                return "isosceles";
            }
            else{
                return "scalene";
            }
        }
        return "none";
    }
}