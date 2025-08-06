// Last updated: 8/6/2025, 11:12:07 AM
class Solution {
    public int searchInsert(int[] nums, int target) {
        if (target > nums[nums.length - 1]){
            return nums.length;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target == nums[mid]){
                return mid;
            }
            else if (target > nums[mid]){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return end + 1;
    }
}