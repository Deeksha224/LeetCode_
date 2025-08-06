// Last updated: 8/6/2025, 11:06:22 AM
class Solution {
    public int sumOfBeauties(int[] nums) {
        int[] max = new int[nums.length];
        int[] min = new int[nums.length];
        max[0] = nums[0];
        min[nums.length - 1] = nums[nums.length - 1];

        for (int i = 1; i < nums.length - 1; i++){
            max[i] =  Math.max(max[i - 1], nums[i]);
            int j = nums.length - 1 - i;
            min[j] = Math.min(min[j + 1], nums[j]);
        }

        int sum = 0;
        for (int i = 1; i < nums.length - 1; i++){
            if (nums[i] > max[i - 1] && nums[i] < min[i + 1]){
                sum += 2;
            }
            else if (nums[i] > nums[i - 1] && nums[i] < nums[i + 1]){
                sum += 1;
            }
        }
        return sum;        
    }
}