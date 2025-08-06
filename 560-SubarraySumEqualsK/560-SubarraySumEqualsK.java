// Last updated: 8/6/2025, 11:08:53 AM
class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = i; j < nums.length; j++){
                sum += nums[j];
                if (sum == k){
                    count++;
                }
            }
            sum = 0;
        }
        return count;
        
    }
}