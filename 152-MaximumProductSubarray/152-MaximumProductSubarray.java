// Last updated: 8/6/2025, 11:11:00 AM
class Solution {
    public int maxProduct(int[] nums) {
        int result = nums[0];
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++){
            if (nums[i] < 0){
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(nums[i], max *nums[i]);
            min = Math.min(nums[i], min*nums[i]);
            result = Math.max(max,result);
        }
        return result;
    }
}