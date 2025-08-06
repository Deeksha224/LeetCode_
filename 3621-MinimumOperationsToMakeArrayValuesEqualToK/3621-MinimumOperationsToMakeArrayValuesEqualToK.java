// Last updated: 8/6/2025, 11:04:30 AM
class Solution {
    public int minOperations(int[] nums, int k) {
        int count = 0;
        int[] arr = new int[101];
        Arrays.sort(nums);
        if (nums[0] < k){
            return -1;
        }
        for (int i = 0; i < nums.length; i++){
            arr[nums[i]]++;
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0 && i != k){
                count++;
            }
        }
        return count;
    }
}