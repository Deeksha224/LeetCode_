// Last updated: 8/6/2025, 11:09:18 AM
class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int left = 0;
        int right = nums.length -1;
        while (left < right){
            int s = nums[right] - nums[left];
            count += s;
            left++;
            right--;
        }
        return count;
    }
}