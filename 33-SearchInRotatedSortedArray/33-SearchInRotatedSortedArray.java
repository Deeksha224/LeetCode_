// Last updated: 8/6/2025, 11:12:10 AM
class Solution {
    public int search(int[] nums, int target) {
        int pivot = findpivot(nums);
        if (pivot == -1){
            return binarysearch (nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target){
            return pivot;
        }
        if (target >= nums[0]){
            return binarysearch (nums, target, 0, pivot - 1);
        }
        if (target < nums[0]){
            return binarysearch (nums, target, pivot + 1, nums.length - 1);
        }
        return -1;
    }
    int findpivot (int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            }
            if (mid > start && nums[mid  -1] > nums[mid]){
                return mid - 1;
            }
            if (nums[mid] <= nums[start]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    int binarysearch (int[] nums, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target > nums[mid]){
                start = mid + 1;
            }
            else if (target < nums[mid]){
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}