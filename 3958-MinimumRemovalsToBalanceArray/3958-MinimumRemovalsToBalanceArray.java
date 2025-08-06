// Last updated: 8/6/2025, 11:04:04 AM
class Solution {
    public int minRemoval(int[] nums, int k) {
        if (nums.length == 1){
            return 0;
        }
        Arrays.sort(nums);
        int count = 0;
        int min = 0;
        for (int i = 0; i < nums.length; i++){
            while (nums[i] > nums[min]*(long)k){
                min++;
            }
            count = Math.max(count,i-min+1);
        }
        return nums.length - count;
    }
}