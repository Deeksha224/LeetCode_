// Last updated: 8/6/2025, 11:11:34 AM
class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target == nums[mid]){
                return true;
            }
            else if (target > nums[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return false;
    }
}