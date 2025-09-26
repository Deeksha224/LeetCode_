class Solution {
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        while (start <= end){
            int mid = (start +end)/2;
            if (nums[mid] == target){
                return true;
            }
            if(nums[start]==nums[mid] && nums[mid]==nums[end]){
                start++;
                end--;
            }
            //left sort
            else if (nums[start] <= nums[mid]){
                if (nums[start] <= target && target <= nums[mid]){
                    end = mid;
                }
                else{
                    start = mid+1;
                }
            }
            //right sort
            else{
                if (nums[mid] <= target && target <= nums[end]){
                    start = mid+1;
                }
                else{
                    end = mid;
                }
            }
        }
        return false;
    }
}