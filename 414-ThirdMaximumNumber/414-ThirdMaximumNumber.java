// Last updated: 8/6/2025, 11:09:29 AM
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int m = nums.length;
        int count = 1;
        if (m >= 3){
            for (int i = m - 1; i > 0; i--){
            if (nums[i] != nums[i - 1]){
                count++;
            }
            if (count == 3){
                return nums[i - 1];
            }
        }
        }
        return (nums[nums.length - 1]);
    }
}