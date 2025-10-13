class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length / 2; i++){
            sum = Math.max((nums[i]+nums[nums.length-1-i]),sum);
        }
        return sum;
    }
}