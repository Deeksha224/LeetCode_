// Last updated: 8/6/2025, 11:12:09 AM
class Solution {
    public int[] searchRange(int[] nums, int target){
        int[] ans = {-1, -1};
        // Check for first occurance
        int start = search (nums,target, true);
        int end = search (nums, target, false);

        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    int search (int[] nums, int target, boolean startIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (nums[mid] > target){
                end = mid - 1;
            }
            else if (nums[mid] < target){
                start = mid + 1;
            }
            else{
                ans = mid;
                if (startIndex){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}