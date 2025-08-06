// Last updated: 8/6/2025, 11:04:47 AM
class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] arr = new int[nums.length/3][3];
        for (int i = 0; i < nums.length; i+=3){
            if (nums[i+2] - nums[i] > k){
                return new int[0][0];
            }
            arr[i/3] = new int[]{nums[i],nums[i+1], nums[i+2]};
        }
        return arr;
    }
}