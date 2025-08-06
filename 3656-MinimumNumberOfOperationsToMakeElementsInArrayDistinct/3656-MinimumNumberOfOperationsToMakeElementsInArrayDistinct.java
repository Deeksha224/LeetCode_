// Last updated: 8/6/2025, 11:04:27 AM
class Solution {
    public int minimumOperations(int[] nums) {
        boolean[] arr = new boolean[101];
        for(int i = nums.length - 1; i >= 0; i--){
            if (arr[nums[i]]){
                return i/3 + 1;
            }
            arr[nums[i]] = true;
        }
        return 0;
    }
}